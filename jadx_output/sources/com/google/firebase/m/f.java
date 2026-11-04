package com.google.firebase.m;

/* JADX INFO: loaded from: classes.dex */
public interface f {

    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);

        private final int g;

        a(int i) {
            this.g = i;
        }

        public int a() {
            return this.g;
        }
    }

    a a(String str);
}
