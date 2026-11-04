package c.b.b.k.b;

/* JADX INFO: loaded from: classes.dex */
final class m extends c {
    m() {
    }

    @Override // c.b.b.k.b.c
    int c(char c2, StringBuilder sb) {
        int i;
        char c3;
        if (c2 == ' ') {
            c3 = 3;
        } else {
            if (c2 >= '0' && c2 <= '9') {
                i = (c2 - '0') + 4;
            } else {
                if (c2 < 'a' || c2 > 'z') {
                    if (c2 < ' ') {
                        sb.append((char) 0);
                        sb.append(c2);
                        return 2;
                    }
                    if (c2 >= '!' && c2 <= '/') {
                        sb.append((char) 1);
                        sb.append((char) (c2 - '!'));
                        return 2;
                    }
                    if (c2 >= ':' && c2 <= '@') {
                        sb.append((char) 1);
                        sb.append((char) ((c2 - ':') + 15));
                        return 2;
                    }
                    if (c2 >= '[' && c2 <= '_') {
                        sb.append((char) 1);
                        sb.append((char) ((c2 - '[') + 22));
                        return 2;
                    }
                    if (c2 == '`') {
                        sb.append((char) 2);
                        sb.append((char) (c2 - '`'));
                        return 2;
                    }
                    if (c2 >= 'A' && c2 <= 'Z') {
                        sb.append((char) 2);
                        sb.append((char) ((c2 - 'A') + 1));
                        return 2;
                    }
                    if (c2 < '{' || c2 > 127) {
                        sb.append("\u0001\u001e");
                        return c((char) (c2 - 128), sb) + 2;
                    }
                    sb.append((char) 2);
                    sb.append((char) ((c2 - '{') + 27));
                    return 2;
                }
                i = (c2 - 'a') + 14;
            }
            c3 = (char) i;
        }
        sb.append(c3);
        return 1;
    }

    @Override // c.b.b.k.b.c
    public int e() {
        return 2;
    }
}
