package top.alexmmd.javabasic.reflect;

import org.springframework.beans.BeansException;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

/**
 * @author 汪永晖
 * @Date 2021/1/7 11:02
 */
public class BeanCopyUtil {

    public static void copyProperties(Object source, Object target) throws IllegalAccessException {
        Class<?> sourceClass = source.getClass();
        Field[] sourcesFields = sourceClass.getDeclaredFields();

        Class<?> targetClass = target.getClass();
        Field[] targetFields = targetClass.getDeclaredFields();

        for (int i = 0; i < targetFields.length; i++) {
            Field targetField = targetFields[i];
            Type targetType = targetField.getGenericType();
            String targetName = targetField.getName();

            for (int j = 0; j < sourcesFields.length; j++) {
                Field sourceField = sourcesFields[j];
                Type sourceType = sourceField.getGenericType();
                String sourceName = sourceField.getName();

                if (targetType.equals(sourceType) && targetName.equals(sourceName)) {
                    targetField.setAccessible(true);
                    sourceField.setAccessible(true);
                    targetField.set(target, sourceField.get(source));
                    break;
                }
            }
        }
    }
}
