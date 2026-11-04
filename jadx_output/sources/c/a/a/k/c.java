package c.a.a.k;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class c implements ParameterizedType {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type[] f2556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Type f2557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Type f2558d;

    public c(Type[] typeArr, Type type, Type type2) {
        this.f2556b = typeArr;
        this.f2557c = type;
        this.f2558d = type2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (!Arrays.equals(this.f2556b, cVar.f2556b)) {
            return false;
        }
        Type type = this.f2557c;
        if (type == null ? cVar.f2557c != null : !type.equals(cVar.f2557c)) {
            return false;
        }
        Type type2 = this.f2558d;
        if (type2 != null) {
            return type2.equals(cVar.f2558d);
        }
        return cVar.f2558d == null;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.f2556b;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.f2557c;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.f2558d;
    }

    public int hashCode() {
        Type[] typeArr = this.f2556b;
        int iHashCode = (typeArr != null ? Arrays.hashCode(typeArr) : 0) * 31;
        Type type = this.f2557c;
        int iHashCode2 = (iHashCode + (type != null ? type.hashCode() : 0)) * 31;
        Type type2 = this.f2558d;
        return iHashCode2 + (type2 != null ? type2.hashCode() : 0);
    }
}
