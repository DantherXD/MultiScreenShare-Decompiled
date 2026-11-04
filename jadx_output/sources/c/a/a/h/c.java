package c.a.a.h;

import c.a.a.g;
import c.a.a.i.d;
import c.a.a.j.a0;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX WARN: Method from annotation default annotation not found: alphabetic */
/* JADX WARN: Method from annotation default annotation not found: asm */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface c {
    String[] ignores() default {};

    Class<?> mappingTo() default Void.class;

    g naming() default g.CamelCase;

    String[] orders() default {};

    d[] parseFeatures() default {};

    Class<?>[] seeAlso() default {};

    a0[] serialzeFeatures() default {};

    String typeKey() default "";

    String typeName() default "";
}
