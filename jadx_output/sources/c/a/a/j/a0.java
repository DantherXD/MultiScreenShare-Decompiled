package c.a.a.j;

/* JADX INFO: loaded from: classes.dex */
public enum a0 {
    QuoteFieldNames,
    UseSingleQuotes,
    WriteMapNullValue,
    WriteEnumUsingToString,
    UseISO8601DateFormat,
    WriteNullListAsEmpty,
    WriteNullStringAsEmpty,
    WriteNullNumberAsZero,
    WriteNullBooleanAsFalse,
    SkipTransientField,
    SortField,
    WriteTabAsSpecial,
    PrettyFormat,
    WriteClassName,
    DisableCircularReferenceDetect,
    WriteSlashAsSpecial,
    WriteDateUseDateFormat,
    NotWriteRootClassName,
    DisableCheckSpecialChar,
    BeanToArray,
    WriteNonStringKeyAsString,
    NotWriteDefaultValue;

    public static final a0[] x = new a0[0];
    public final int z = 1 << ordinal();

    a0() {
    }

    public static int a(a0[] a0VarArr) {
        if (a0VarArr == null) {
            return 0;
        }
        int i = 0;
        for (a0 a0Var : a0VarArr) {
            i |= a0Var.z;
        }
        return i;
    }
}
