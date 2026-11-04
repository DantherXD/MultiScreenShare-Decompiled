package a.g.d.f;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class c {

    public interface a {
    }

    public static final class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0009c[] f456a;

        public b(C0009c[] c0009cArr) {
            this.f456a = c0009cArr;
        }

        public C0009c[] a() {
            return this.f456a;
        }
    }

    /* JADX INFO: renamed from: a.g.d.f.c$c, reason: collision with other inner class name */
    public static final class C0009c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f458b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f459c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f460d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f461e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f462f;

        public C0009c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f457a = str;
            this.f458b = i;
            this.f459c = z;
            this.f460d = str2;
            this.f461e = i2;
            this.f462f = i3;
        }

        public String a() {
            return this.f457a;
        }

        public int b() {
            return this.f462f;
        }

        public int c() {
            return this.f461e;
        }

        public String d() {
            return this.f460d;
        }

        public int e() {
            return this.f458b;
        }

        public boolean f() {
            return this.f459c;
        }
    }

    public static final class d implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a.g.i.d f463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f465c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f466d;

        public d(a.g.i.d dVar, int i, int i2, String str) {
            this.f463a = dVar;
            this.f465c = i;
            this.f464b = i2;
            this.f466d = str;
        }

        public int a() {
            return this.f465c;
        }

        public a.g.i.d b() {
            return this.f463a;
        }

        public String c() {
            return this.f466d;
        }

        public int d() {
            return this.f464b;
        }
    }

    private static int a(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    public static a b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return d(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List<List<byte[]>> c(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < typedArrayObtainTypedArray.length(); i2++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(h(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static a d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return e(xmlPullParser, resources);
        }
        g(xmlPullParser);
        return null;
    }

    private static a e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a.g.c.f443e);
        String string = typedArrayObtainAttributes.getString(a.g.c.f444f);
        String string2 = typedArrayObtainAttributes.getString(a.g.c.j);
        String string3 = typedArrayObtainAttributes.getString(a.g.c.k);
        int resourceId = typedArrayObtainAttributes.getResourceId(a.g.c.g, 0);
        int integer = typedArrayObtainAttributes.getInteger(a.g.c.h, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(a.g.c.i, 500);
        String string4 = typedArrayObtainAttributes.getString(a.g.c.l);
        typedArrayObtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                g(xmlPullParser);
            }
            return new d(new a.g.i.d(string, string2, string3, c(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(f(xmlPullParser, resources));
                } else {
                    g(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new b((C0009c[]) arrayList.toArray(new C0009c[arrayList.size()]));
    }

    private static C0009c f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), a.g.c.m);
        int i = a.g.c.v;
        if (!typedArrayObtainAttributes.hasValue(i)) {
            i = a.g.c.o;
        }
        int i2 = typedArrayObtainAttributes.getInt(i, 400);
        int i3 = a.g.c.t;
        if (!typedArrayObtainAttributes.hasValue(i3)) {
            i3 = a.g.c.p;
        }
        boolean z = 1 == typedArrayObtainAttributes.getInt(i3, 0);
        int i4 = a.g.c.w;
        if (!typedArrayObtainAttributes.hasValue(i4)) {
            i4 = a.g.c.q;
        }
        int i5 = a.g.c.u;
        if (!typedArrayObtainAttributes.hasValue(i5)) {
            i5 = a.g.c.r;
        }
        String string = typedArrayObtainAttributes.getString(i5);
        int i6 = typedArrayObtainAttributes.getInt(i4, 0);
        int i7 = a.g.c.s;
        if (!typedArrayObtainAttributes.hasValue(i7)) {
            i7 = a.g.c.n;
        }
        int resourceId = typedArrayObtainAttributes.getResourceId(i7, 0);
        String string2 = typedArrayObtainAttributes.getString(i7);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            g(xmlPullParser);
        }
        return new C0009c(string2, i2, z, string, i6, resourceId);
    }

    private static void g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    private static List<byte[]> h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
