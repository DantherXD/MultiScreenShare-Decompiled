package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final r f4050a = new r(null, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Long f4051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TimeZone f4052c;

    private r(Long l, TimeZone timeZone) {
        this.f4051b = l;
        this.f4052c = timeZone;
    }

    static r c() {
        return f4050a;
    }

    Calendar a() {
        return b(this.f4052c);
    }

    Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.f4051b;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}
