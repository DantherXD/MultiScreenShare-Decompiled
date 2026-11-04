package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f1596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    d f1597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f1598c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f1599d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SparseArray<a> f1600e = new SparseArray<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private SparseArray<d> f1601f = new SparseArray<>();
    private f g;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f1602a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList<b> f1603b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1604c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        d f1605d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f1604c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.U6);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == i.V6) {
                    this.f1602a = typedArrayObtainStyledAttributes.getResourceId(index, this.f1602a);
                } else if (index == i.W6) {
                    this.f1604c = typedArrayObtainStyledAttributes.getResourceId(index, this.f1604c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1604c);
                    context.getResources().getResourceName(this.f1604c);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f1605d = dVar;
                        dVar.f(context, this.f1604c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f1603b.add(bVar);
        }

        public int b(float f2, float f3) {
            for (int i = 0; i < this.f1603b.size(); i++) {
                if (this.f1603b.get(i).a(f2, f3)) {
                    return i;
                }
            }
            return -1;
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f1606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f1607b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f1608c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f1609d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1610e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        d f1611f;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f1606a = Float.NaN;
            this.f1607b = Float.NaN;
            this.f1608c = Float.NaN;
            this.f1609d = Float.NaN;
            this.f1610e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), i.s7);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == i.t7) {
                    this.f1610e = typedArrayObtainStyledAttributes.getResourceId(index, this.f1610e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1610e);
                    context.getResources().getResourceName(this.f1610e);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f1611f = dVar;
                        dVar.f(context, this.f1610e);
                    }
                } else if (index == i.u7) {
                    this.f1609d = typedArrayObtainStyledAttributes.getDimension(index, this.f1609d);
                } else if (index == i.v7) {
                    this.f1607b = typedArrayObtainStyledAttributes.getDimension(index, this.f1607b);
                } else if (index == i.w7) {
                    this.f1608c = typedArrayObtainStyledAttributes.getDimension(index, this.f1608c);
                } else if (index == i.x7) {
                    this.f1606a = typedArrayObtainStyledAttributes.getDimension(index, this.f1606a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        boolean a(float f2, float f3) {
            if (!Float.isNaN(this.f1606a) && f2 < this.f1606a) {
                return false;
            }
            if (!Float.isNaN(this.f1607b) && f3 < this.f1607b) {
                return false;
            }
            if (Float.isNaN(this.f1608c) || f2 <= this.f1608c) {
                return Float.isNaN(this.f1609d) || f3 <= this.f1609d;
            }
            return false;
        }
    }

    c(Context context, ConstraintLayout constraintLayout, int i) {
        this.f1596a = constraintLayout;
        a(context, i);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        a aVar = null;
        try {
            int eventType = xml.getEventType();
            while (true) {
                byte b2 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (!name.equals("ConstraintSet")) {
                                b2 = -1;
                            } else {
                                b2 = 4;
                            }
                            break;
                        case 80204913:
                            if (!name.equals("State")) {
                                b2 = -1;
                            } else {
                                b2 = 2;
                            }
                            break;
                        case 1382829617:
                            if (!name.equals("StateSet")) {
                                b2 = -1;
                            }
                            break;
                        case 1657696882:
                            if (!name.equals("layoutDescription")) {
                                b2 = -1;
                            } else {
                                b2 = 0;
                            }
                            break;
                        case 1901439077:
                            if (!name.equals("Variant")) {
                                b2 = -1;
                            } else {
                                b2 = 3;
                            }
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    if (b2 == 2) {
                        aVar = new a(context, xml);
                        this.f1600e.put(aVar.f1602a, aVar);
                    } else if (b2 == 3) {
                        b bVar = new b(context, xml);
                        if (aVar != null) {
                            aVar.a(bVar);
                        }
                    } else if (b2 == 4) {
                        b(context, xml);
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        d dVar = new d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.n(context, xmlPullParser);
                this.f1601f.put(identifier, dVar);
                return;
            }
        }
    }

    public void c(f fVar) {
    }

    public void d(int i, float f2, float f3) {
        int iB;
        int i2 = this.f1598c;
        if (i2 == i) {
            a aVarValueAt = i == -1 ? this.f1600e.valueAt(0) : this.f1600e.get(i2);
            int i3 = this.f1599d;
            if ((i3 == -1 || !aVarValueAt.f1603b.get(i3).a(f2, f3)) && this.f1599d != (iB = aVarValueAt.b(f2, f3))) {
                d dVar = iB == -1 ? this.f1597b : aVarValueAt.f1603b.get(iB).f1611f;
                if (iB != -1) {
                    int i4 = aVarValueAt.f1603b.get(iB).f1610e;
                }
                if (dVar == null) {
                    return;
                }
                this.f1599d = iB;
                if (this.g != null) {
                    throw null;
                }
                dVar.c(this.f1596a);
                if (this.g != null) {
                    throw null;
                }
                return;
            }
            return;
        }
        this.f1598c = i;
        a aVar = this.f1600e.get(i);
        int iB2 = aVar.b(f2, f3);
        d dVar2 = iB2 == -1 ? aVar.f1605d : aVar.f1603b.get(iB2).f1611f;
        if (iB2 != -1) {
            int i5 = aVar.f1603b.get(iB2).f1610e;
        }
        if (dVar2 != null) {
            this.f1599d = iB2;
            if (this.g != null) {
                throw null;
            }
            dVar2.c(this.f1596a);
            if (this.g != null) {
                throw null;
            }
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i + ", dim =" + f2 + ", " + f3);
    }
}
