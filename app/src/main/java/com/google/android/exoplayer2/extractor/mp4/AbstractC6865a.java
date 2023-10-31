package com.google.android.exoplayer2.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.C0552c;
import com.applovin.impl.adview.activity.p010b.C2745h;
import com.google.android.exoplayer2.util.C7436v;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.exoplayer2.extractor.mp4.a */
/* loaded from: classes.dex */
public abstract class AbstractC6865a {

    /* renamed from: a */
    public final int f11463a;

    /* renamed from: com.google.android.exoplayer2.extractor.mp4.a$a */
    /* loaded from: classes.dex */
    public static final class C6866a extends AbstractC6865a {

        /* renamed from: b */
        public final long f11464b;

        /* renamed from: c */
        public final ArrayList f11465c;

        /* renamed from: d */
        public final ArrayList f11466d;

        public C6866a(int i, long j) {
            super(i);
            this.f11464b = j;
            this.f11465c = new ArrayList();
            this.f11466d = new ArrayList();
        }

        @Nullable
        /* renamed from: b */
        public final C6866a m5887b(int i) {
            ArrayList arrayList = this.f11466d;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C6866a c6866a = (C6866a) arrayList.get(i2);
                if (c6866a.f11463a == i) {
                    return c6866a;
                }
            }
            return null;
        }

        @Nullable
        /* renamed from: c */
        public final C6867b m5886c(int i) {
            ArrayList arrayList = this.f11465c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C6867b c6867b = (C6867b) arrayList.get(i2);
                if (c6867b.f11463a == i) {
                    return c6867b;
                }
            }
            return null;
        }

        @Override // com.google.android.exoplayer2.extractor.mp4.AbstractC6865a
        public final String toString() {
            String m5888a = AbstractC6865a.m5888a(this.f11463a);
            String arrays = Arrays.toString(this.f11465c.toArray());
            String arrays2 = Arrays.toString(this.f11466d.toArray());
            StringBuilder m9043a = C2745h.m9043a(C0552c.m12193a(arrays2, C0552c.m12193a(arrays, C0552c.m12193a(m5888a, 22))), m5888a, " leaves: ", arrays, " containers: ");
            m9043a.append(arrays2);
            return m9043a.toString();
        }
    }

    /* renamed from: com.google.android.exoplayer2.extractor.mp4.a$b */
    /* loaded from: classes.dex */
    public static final class C6867b extends AbstractC6865a {

        /* renamed from: b */
        public final C7436v f11467b;

        public C6867b(int i, C7436v c7436v) {
            super(i);
            this.f11467b = c7436v;
        }
    }

    public AbstractC6865a(int i) {
        this.f11463a = i;
    }

    /* renamed from: a */
    public static String m5888a(int i) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public String toString() {
        return m5888a(this.f11463a);
    }
}
