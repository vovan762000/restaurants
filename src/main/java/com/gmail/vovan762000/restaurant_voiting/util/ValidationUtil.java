package com.gmail.vovan762000.restaurant_voiting.util;

import com.gmail.vovan762000.restaurant_voiting.model.AbstractBaseEntity;
import com.gmail.vovan762000.restaurant_voiting.model.Vote;
import com.gmail.vovan762000.restaurant_voiting.util.exception.IncorrectDataException;
import com.gmail.vovan762000.restaurant_voiting.util.exception.NotFoundException;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class ValidationUtil {
    private final LocalTime END_TIME = LocalTime.of(11,00);

    private ValidationUtil() {
    }

    public static void checkTime(Vote vote){
        LocalDateTime currentDateTime = LocalDateTime.now();
        if (!currentDateTime.toLocalDate().equals(vote.getDate())
                || currentDateTime.toLocalTime().compareTo(LocalTime.of(11,00))<=0){
            throw new IncorrectDataException("You can't change your mind after " + vote.getTime());
        }
    }

    public static <T> T checkNotFoundWithId(T object, int id) {
        checkNotFoundWithId(object != null, id);
        return object;
    }

    public static void checkNotFoundWithId(boolean found, int id) {
        checkNotFound(found, "id=" + id);
    }

    public static <T> T checkNotFound(T object, String msg) {
        checkNotFound(object != null, msg);
        return object;
    }

    public static void checkNotFound(boolean found, String msg) {
        if (!found) {
            throw new NotFoundException("Not found entity with " + msg);
        }
    }

    public static void checkNew(AbstractBaseEntity entity) {
        if (!entity.isNew()) {
            throw new IllegalArgumentException(entity + " must be new (id=null)");
        }
    }

    public static void assureIdConsistent(AbstractBaseEntity entity, int id) {
//      conservative when you reply, but accept liberally (http://stackoverflow.com/a/32728226/548473)
        if (entity.isNew()) {
            entity.setId(id);
        } else if (entity.id() != id) {
            throw new IllegalArgumentException(entity + " must be with id=" + id);
        }
    }
}
