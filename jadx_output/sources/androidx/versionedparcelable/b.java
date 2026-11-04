package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseIntArray f2384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Parcel f2385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f2386f;
    private final int g;
    private final String h;
    private int i;
    private int j;
    private int k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new a.d.a(), new a.d.a(), new a.d.a());
    }

    private b(Parcel parcel, int i, int i2, String str, a.d.a<String, Method> aVar, a.d.a<String, Method> aVar2, a.d.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f2384d = new SparseIntArray();
        this.i = -1;
        this.j = 0;
        this.k = -1;
        this.f2385e = parcel;
        this.f2386f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }

    @Override // androidx.versionedparcelable.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f2385e.writeInt(-1);
        } else {
            this.f2385e.writeInt(bArr.length);
            this.f2385e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f2385e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void E(int i) {
        this.f2385e.writeInt(i);
    }

    @Override // androidx.versionedparcelable.a
    public void G(Parcelable parcelable) {
        this.f2385e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void I(String str) {
        this.f2385e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i = this.i;
        if (i >= 0) {
            int i2 = this.f2384d.get(i);
            int iDataPosition = this.f2385e.dataPosition();
            this.f2385e.setDataPosition(i2);
            this.f2385e.writeInt(iDataPosition - i2);
            this.f2385e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f2385e;
        int iDataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f2386f) {
            i = this.g;
        }
        return new b(parcel, iDataPosition, i, this.h + "  ", this.f2381a, this.f2382b, this.f2383c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean g() {
        return this.f2385e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] i() {
        int i = this.f2385e.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        this.f2385e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f2385e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean m(int i) {
        while (this.j < this.g) {
            int i2 = this.k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f2385e.setDataPosition(this.j);
            int i3 = this.f2385e.readInt();
            this.k = this.f2385e.readInt();
            this.j += i3;
        }
        return this.k == i;
    }

    @Override // androidx.versionedparcelable.a
    public int o() {
        return this.f2385e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public <T extends Parcelable> T q() {
        return (T) this.f2385e.readParcelable(b.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String s() {
        return this.f2385e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void w(int i) {
        a();
        this.i = i;
        this.f2384d.put(i, this.f2385e.dataPosition());
        E(0);
        E(i);
    }

    @Override // androidx.versionedparcelable.a
    public void y(boolean z) {
        this.f2385e.writeInt(z ? 1 : 0);
    }
}
