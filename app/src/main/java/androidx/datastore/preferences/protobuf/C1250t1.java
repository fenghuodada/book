package androidx.datastore.preferences.protobuf;

import okio.Utf8;

/* renamed from: androidx.datastore.preferences.protobuf.t1 */
/* loaded from: classes.dex */
public final class C1250t1 {

    /* renamed from: a */
    public static final AbstractC1252b f3086a;

    /* renamed from: androidx.datastore.preferences.protobuf.t1$a */
    /* loaded from: classes.dex */
    public static class C1251a {
        /* renamed from: a */
        public static void m10784a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws C1163c0 {
            if (!m10782c(b2)) {
                if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !m10782c(b3) && !m10782c(b4)) {
                    int i2 = ((b & 7) << 18) | ((b2 & Utf8.REPLACEMENT_BYTE) << 12) | ((b3 & Utf8.REPLACEMENT_BYTE) << 6) | (b4 & Utf8.REPLACEMENT_BYTE);
                    cArr[i] = (char) ((i2 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                    cArr[i + 1] = (char) ((i2 & 1023) + Utf8.LOG_SURROGATE_HEADER);
                    return;
                }
            }
            throw C1163c0.m11139a();
        }

        /* renamed from: b */
        public static void m10783b(byte b, byte b2, byte b3, char[] cArr, int i) throws C1163c0 {
            if (m10782c(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m10782c(b3)))) {
                throw C1163c0.m11139a();
            }
            cArr[i] = (char) (((b & 15) << 12) | ((b2 & Utf8.REPLACEMENT_BYTE) << 6) | (b3 & Utf8.REPLACEMENT_BYTE));
        }

        /* renamed from: c */
        public static boolean m10782c(byte b) {
            return b > -65;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.t1$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1252b {
        /* renamed from: a */
        public abstract String mo10781a(int i, byte[] bArr, int i2) throws C1163c0;

        /* renamed from: b */
        public abstract int mo10780b(CharSequence charSequence, byte[] bArr, int i, int i2);

        /* renamed from: c */
        public abstract int mo10779c(int i, int i2, byte[] bArr);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.t1$c */
    /* loaded from: classes.dex */
    public static final class C1253c extends AbstractC1252b {
        @Override // androidx.datastore.preferences.protobuf.C1250t1.AbstractC1252b
        /* renamed from: a */
        public final String mo10781a(int i, byte[] bArr, int i2) throws C1163c0 {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte b = bArr[i];
                    if (b >= 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (!z5) {
                        break;
                    }
                    i++;
                    cArr[i4] = (char) b;
                    i4++;
                }
                int i5 = i4;
                while (i < i3) {
                    int i6 = i + 1;
                    byte b2 = bArr[i];
                    if (b2 >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        int i7 = i5 + 1;
                        cArr[i5] = (char) b2;
                        i = i6;
                        while (true) {
                            i5 = i7;
                            if (i >= i3) {
                                break;
                            }
                            byte b3 = bArr[i];
                            if (b3 >= 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                break;
                            }
                            i++;
                            i7 = i5 + 1;
                            cArr[i5] = (char) b3;
                        }
                    } else {
                        if (b2 < -32) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            if (i6 < i3) {
                                int i8 = i6 + 1;
                                byte b4 = bArr[i6];
                                int i9 = i5 + 1;
                                if (b2 >= -62 && !C1251a.m10782c(b4)) {
                                    cArr[i5] = (char) (((b2 & 31) << 6) | (b4 & Utf8.REPLACEMENT_BYTE));
                                    i = i8;
                                    i5 = i9;
                                } else {
                                    throw C1163c0.m11139a();
                                }
                            } else {
                                throw C1163c0.m11139a();
                            }
                        } else {
                            if (b2 < -16) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                if (i6 < i3 - 1) {
                                    int i10 = i6 + 1;
                                    C1251a.m10783b(b2, bArr[i6], bArr[i10], cArr, i5);
                                    i = i10 + 1;
                                    i5++;
                                } else {
                                    throw C1163c0.m11139a();
                                }
                            } else if (i6 < i3 - 2) {
                                int i11 = i6 + 1;
                                byte b5 = bArr[i6];
                                int i12 = i11 + 1;
                                C1251a.m10784a(b2, b5, bArr[i11], bArr[i12], cArr, i5);
                                i5 = i5 + 1 + 1;
                                i = i12 + 1;
                            } else {
                                throw C1163c0.m11139a();
                            }
                        }
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
            return r10 + r0;
         */
        @Override // androidx.datastore.preferences.protobuf.C1250t1.AbstractC1252b
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int mo10780b(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 250
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1250t1.C1253c.mo10780b(java.lang.CharSequence, byte[], int, int):int");
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0078  */
        @Override // androidx.datastore.preferences.protobuf.C1250t1.AbstractC1252b
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int mo10779c(int r7, int r8, byte[] r9) {
            /*
                r6 = this;
            L0:
                if (r7 >= r8) goto L9
                r0 = r9[r7]
                if (r0 < 0) goto L9
                int r7 = r7 + 1
                goto L0
            L9:
                if (r7 < r8) goto Lc
                goto Le
            Lc:
                if (r7 < r8) goto L11
            Le:
                r7 = 0
                goto L9b
            L11:
                int r0 = r7 + 1
                r7 = r9[r7]
                if (r7 >= 0) goto L9c
                r1 = -32
                r2 = -1
                r3 = -65
                if (r7 >= r1) goto L2e
                if (r0 < r8) goto L22
                goto L9b
            L22:
                r1 = -62
                if (r7 < r1) goto L9a
                int r7 = r0 + 1
                r0 = r9[r0]
                if (r0 <= r3) goto Lc
                goto L9a
            L2e:
                r4 = -16
                if (r7 >= r4) goto L50
                int r4 = r8 + (-1)
                if (r0 < r4) goto L37
                goto L54
            L37:
                int r4 = r0 + 1
                r0 = r9[r0]
                if (r0 > r3) goto L9a
                r5 = -96
                if (r7 != r1) goto L43
                if (r0 < r5) goto L9a
            L43:
                r1 = -19
                if (r7 != r1) goto L49
                if (r0 >= r5) goto L9a
            L49:
                int r7 = r4 + 1
                r0 = r9[r4]
                if (r0 <= r3) goto Lc
                goto L9a
            L50:
                int r1 = r8 + (-2)
                if (r0 < r1) goto L7f
            L54:
                int r7 = r0 + (-1)
                r7 = r9[r7]
                int r8 = r8 - r0
                if (r8 == 0) goto L78
                r1 = 1
                if (r8 == r1) goto L71
                r2 = 2
                if (r8 != r2) goto L6b
                r8 = r9[r0]
                int r0 = r0 + r1
                r9 = r9[r0]
                int r7 = androidx.datastore.preferences.protobuf.C1250t1.m10785c(r7, r8, r9)
                goto L9b
            L6b:
                java.lang.AssertionError r7 = new java.lang.AssertionError
                r7.<init>()
                throw r7
            L71:
                r8 = r9[r0]
                int r7 = androidx.datastore.preferences.protobuf.C1250t1.m10786b(r7, r8)
                goto L9b
            L78:
                r8 = -12
                if (r7 <= r8) goto L7d
                goto L9a
            L7d:
                r2 = r7
                goto L9a
            L7f:
                int r1 = r0 + 1
                r0 = r9[r0]
                if (r0 > r3) goto L9a
                int r7 = r7 << 28
                int r0 = r0 + 112
                int r0 = r0 + r7
                int r7 = r0 >> 30
                if (r7 != 0) goto L9a
                int r7 = r1 + 1
                r0 = r9[r1]
                if (r0 > r3) goto L9a
                int r0 = r7 + 1
                r7 = r9[r7]
                if (r7 <= r3) goto L9c
            L9a:
                r7 = r2
            L9b:
                return r7
            L9c:
                r7 = r0
                goto Lc
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1250t1.C1253c.mo10779c(int, int, byte[]):int");
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.t1$d */
    /* loaded from: classes.dex */
    public static class C1254d extends IllegalArgumentException {
        public C1254d(int i, int i2) {
            super(C1194j.m11060a("Unpaired surrogate at index ", i, " of ", i2));
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.t1$e */
    /* loaded from: classes.dex */
    public static final class C1255e extends AbstractC1252b {
        /* renamed from: d */
        public static int m10778d(long j, byte[] bArr, int i, int i2) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        return C1250t1.m10785c(i, C1242s1.m10830g(bArr, j), C1242s1.m10830g(bArr, j + 1));
                    }
                    throw new AssertionError();
                }
                return C1250t1.m10786b(i, C1242s1.m10830g(bArr, j));
            }
            AbstractC1252b abstractC1252b = C1250t1.f3086a;
            if (i > -12) {
                return -1;
            }
            return i;
        }

        @Override // androidx.datastore.preferences.protobuf.C1250t1.AbstractC1252b
        /* renamed from: a */
        public final String mo10781a(int i, byte[] bArr, int i2) throws C1163c0 {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (i < i3) {
                    byte m10830g = C1242s1.m10830g(bArr, i);
                    if (m10830g >= 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (!z5) {
                        break;
                    }
                    i++;
                    cArr[i4] = (char) m10830g;
                    i4++;
                }
                int i5 = i4;
                while (i < i3) {
                    int i6 = i + 1;
                    byte m10830g2 = C1242s1.m10830g(bArr, i);
                    if (m10830g2 >= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        int i7 = i5 + 1;
                        cArr[i5] = (char) m10830g2;
                        i = i6;
                        while (true) {
                            i5 = i7;
                            if (i >= i3) {
                                break;
                            }
                            byte m10830g3 = C1242s1.m10830g(bArr, i);
                            if (m10830g3 >= 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                break;
                            }
                            i++;
                            i7 = i5 + 1;
                            cArr[i5] = (char) m10830g3;
                        }
                    } else {
                        if (m10830g2 < -32) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            if (i6 < i3) {
                                int i8 = i6 + 1;
                                byte m10830g4 = C1242s1.m10830g(bArr, i6);
                                int i9 = i5 + 1;
                                if (m10830g2 >= -62 && !C1251a.m10782c(m10830g4)) {
                                    cArr[i5] = (char) (((m10830g2 & 31) << 6) | (m10830g4 & Utf8.REPLACEMENT_BYTE));
                                    i = i8;
                                    i5 = i9;
                                } else {
                                    throw C1163c0.m11139a();
                                }
                            } else {
                                throw C1163c0.m11139a();
                            }
                        } else {
                            if (m10830g2 < -16) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                if (i6 < i3 - 1) {
                                    int i10 = i6 + 1;
                                    C1251a.m10783b(m10830g2, C1242s1.m10830g(bArr, i6), C1242s1.m10830g(bArr, i10), cArr, i5);
                                    i = i10 + 1;
                                    i5++;
                                } else {
                                    throw C1163c0.m11139a();
                                }
                            } else if (i6 < i3 - 2) {
                                int i11 = i6 + 1;
                                int i12 = i11 + 1;
                                C1251a.m10784a(m10830g2, C1242s1.m10830g(bArr, i6), C1242s1.m10830g(bArr, i11), C1242s1.m10830g(bArr, i12), cArr, i5);
                                i5 = i5 + 1 + 1;
                                i = i12 + 1;
                            } else {
                                throw C1163c0.m11139a();
                            }
                        }
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }

        @Override // androidx.datastore.preferences.protobuf.C1250t1.AbstractC1252b
        /* renamed from: b */
        public final int mo10780b(CharSequence charSequence, byte[] bArr, int i, int i2) {
            long j;
            char c;
            long j2;
            long j3;
            char c2;
            int i3;
            char charAt;
            long j4 = i;
            long j5 = i2 + j4;
            int length = charSequence.length();
            if (length > i2 || bArr.length - i2 < i) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i2));
            }
            int i4 = 0;
            while (true) {
                j = 1;
                c = 128;
                if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                    break;
                }
                C1242s1.m10821p(bArr, j4, (byte) charAt);
                i4++;
                j4 = 1 + j4;
            }
            if (i4 == length) {
                return (int) j4;
            }
            while (i4 < length) {
                char charAt2 = charSequence.charAt(i4);
                if (charAt2 < c && j4 < j5) {
                    long j6 = j4 + j;
                    C1242s1.m10821p(bArr, j4, (byte) charAt2);
                    j3 = j;
                    j2 = j6;
                    c2 = c;
                } else if (charAt2 < 2048 && j4 <= j5 - 2) {
                    long j7 = j4 + j;
                    C1242s1.m10821p(bArr, j4, (byte) ((charAt2 >>> 6) | 960));
                    long j8 = j7 + j;
                    C1242s1.m10821p(bArr, j7, (byte) ((charAt2 & '?') | 128));
                    long j9 = j;
                    c2 = 128;
                    j2 = j8;
                    j3 = j9;
                } else if ((charAt2 >= 55296 && 57343 >= charAt2) || j4 > j5 - 3) {
                    if (j4 > j5 - 4) {
                        if (55296 > charAt2 || charAt2 > 57343 || ((i3 = i4 + 1) != length && Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j4);
                        }
                        throw new C1254d(i4, length);
                    }
                    int i5 = i4 + 1;
                    if (i5 != length) {
                        char charAt3 = charSequence.charAt(i5);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            long j10 = j4 + 1;
                            C1242s1.m10821p(bArr, j4, (byte) ((codePoint >>> 18) | 240));
                            long j11 = j10 + 1;
                            c2 = 128;
                            C1242s1.m10821p(bArr, j10, (byte) (((codePoint >>> 12) & 63) | 128));
                            long j12 = j11 + 1;
                            C1242s1.m10821p(bArr, j11, (byte) (((codePoint >>> 6) & 63) | 128));
                            j3 = 1;
                            j2 = j12 + 1;
                            C1242s1.m10821p(bArr, j12, (byte) ((codePoint & 63) | 128));
                            i4 = i5;
                        } else {
                            i4 = i5;
                        }
                    }
                    throw new C1254d(i4 - 1, length);
                } else {
                    long j13 = j4 + j;
                    C1242s1.m10821p(bArr, j4, (byte) ((charAt2 >>> '\f') | 480));
                    long j14 = j13 + j;
                    C1242s1.m10821p(bArr, j13, (byte) (((charAt2 >>> 6) & 63) | 128));
                    C1242s1.m10821p(bArr, j14, (byte) ((charAt2 & '?') | 128));
                    j2 = j14 + 1;
                    j3 = 1;
                    c2 = 128;
                }
                i4++;
                c = c2;
                long j15 = j3;
                j4 = j2;
                j = j15;
            }
            return (int) j4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:87:?, code lost:
            return m10778d(r4, r15, r14, r13);
         */
        @Override // androidx.datastore.preferences.protobuf.C1250t1.AbstractC1252b
        /* renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final int mo10779c(int r13, int r14, byte[] r15) {
            /*
                Method dump skipped, instructions count: 209
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1250t1.C1255e.mo10779c(int, int, byte[]):int");
        }
    }

    static {
        boolean z;
        AbstractC1252b c1253c;
        if (C1242s1.f3082f && C1242s1.f3081e) {
            z = true;
        } else {
            z = false;
        }
        if (z && !C1166d.m11133a()) {
            c1253c = new C1255e();
        } else {
            c1253c = new C1253c();
        }
        f3086a = c1253c;
    }

    /* renamed from: a */
    public static int m10787a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new C1254d(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }

    /* renamed from: b */
    public static int m10786b(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: c */
    public static int m10785c(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }
}
