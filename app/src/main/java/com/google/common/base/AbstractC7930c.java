package com.google.common.base;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible(emulated = true)
/* renamed from: com.google.common.base.c */
/* loaded from: classes3.dex */
public abstract class AbstractC7930c implements InterfaceC7939h<Character> {

    /* renamed from: com.google.common.base.c$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC7931a extends AbstractC7930c {
        @Override // com.google.common.base.InterfaceC7939h
        @Deprecated
        public final boolean apply(Character ch) {
            return mo4291b(ch.charValue());
        }
    }

    /* renamed from: com.google.common.base.c$b */
    /* loaded from: classes3.dex */
    public static final class C7932b extends AbstractC7931a {

        /* renamed from: b */
        public final char f15688b;

        public C7932b(char c) {
            this.f15688b = c;
        }

        @Override // com.google.common.base.AbstractC7930c
        /* renamed from: b */
        public final boolean mo4291b(char c) {
            return c == this.f15688b;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CharMatcher.is('");
            char[] cArr = {'\\', 'u', 0, 0, 0, 0};
            char c = this.f15688b;
            for (int i = 0; i < 4; i++) {
                cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
                c = (char) (c >> 4);
            }
            sb.append(String.copyValueOf(cArr));
            sb.append("')");
            return sb.toString();
        }
    }

    /* renamed from: com.google.common.base.c$c */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC7933c extends AbstractC7931a {

        /* renamed from: b */
        public final String f15689b = "CharMatcher.none()";

        public final String toString() {
            return this.f15689b;
        }
    }

    /* renamed from: com.google.common.base.c$d */
    /* loaded from: classes3.dex */
    public static final class C7934d extends AbstractC7933c {

        /* renamed from: c */
        public static final C7934d f15690c = new C7934d();

        @Override // com.google.common.base.AbstractC7930c
        /* renamed from: a */
        public final int mo4292a(int i, CharSequence charSequence) {
            C7938g.m4287c(i, charSequence.length());
            return -1;
        }

        @Override // com.google.common.base.AbstractC7930c
        /* renamed from: b */
        public final boolean mo4291b(char c) {
            return false;
        }
    }

    /* renamed from: a */
    public int mo4292a(int i, CharSequence charSequence) {
        int length = charSequence.length();
        C7938g.m4287c(i, length);
        while (i < length) {
            if (mo4291b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: b */
    public abstract boolean mo4291b(char c);
}
