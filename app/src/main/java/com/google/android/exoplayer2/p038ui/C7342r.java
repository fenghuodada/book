package com.google.android.exoplayer2.p038ui;

import android.content.Context;
import android.text.Layout;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.p038ui.SubtitleView;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.util.C7408g0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.ui.r */
/* loaded from: classes.dex */
public final class C7342r extends FrameLayout implements SubtitleView.InterfaceC7314a {

    /* renamed from: a */
    public final C7317a f13704a;

    /* renamed from: b */
    public final C7341q f13705b;

    /* renamed from: c */
    public List<Cue> f13706c;

    /* renamed from: d */
    public CaptionStyleCompat f13707d;

    /* renamed from: e */
    public float f13708e;

    /* renamed from: f */
    public int f13709f;

    /* renamed from: g */
    public float f13710g;

    /* renamed from: com.google.android.exoplayer2.ui.r$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C7343a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13711a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f13711a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13711a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13711a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C7342r(Context context) {
        super(context, null);
        this.f13706c = Collections.emptyList();
        this.f13707d = CaptionStyleCompat.f13502g;
        this.f13708e = 0.0533f;
        this.f13709f = 0;
        this.f13710g = 0.08f;
        C7317a c7317a = new C7317a(context);
        this.f13704a = c7317a;
        C7341q c7341q = new C7341q(context);
        this.f13705b = c7341q;
        c7341q.setBackgroundColor(0);
        addView(c7317a);
        addView(c7341q);
    }

    /* renamed from: b */
    public static int m5180b(int i) {
        if (i != 1) {
            return i != 2 ? 0 : -100;
        }
        return -50;
    }

    @Override // com.google.android.exoplayer2.p038ui.SubtitleView.InterfaceC7314a
    /* renamed from: a */
    public final void mo5181a(List<Cue> list, CaptionStyleCompat captionStyleCompat, float f, int i, float f2) {
        this.f13707d = captionStyleCompat;
        this.f13708e = f;
        this.f13709f = i;
        this.f13710g = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Cue cue = list.get(i2);
            if (cue.f12972d != null) {
                arrayList.add(cue);
            } else {
                arrayList2.add(cue);
            }
        }
        if (!this.f13706c.isEmpty() || !arrayList2.isEmpty()) {
            this.f13706c = arrayList2;
            m5178d();
        }
        this.f13704a.mo5181a(arrayList, captionStyleCompat, f, i, f2);
        invalidate();
    }

    /* renamed from: c */
    public final String m5179c(float f, int i) {
        float m5187b = C7337n.m5187b(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return m5187b == -3.4028235E38f ? "unset" : C7408g0.m5096j("%.2fpx", Float.valueOf(m5187b / getContext().getResources().getDisplayMetrics().density));
    }

    /* JADX WARN: Code restructure failed: missing block: B:193:0x0464, code lost:
        if (((android.text.style.TypefaceSpan) r8).getFamily() != null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01cc, code lost:
        if (r6 != 0) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01cf, code lost:
        if (r6 != 0) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01d2, code lost:
        r23 = "right";
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01d4, code lost:
        r0 = 2;
        r24 = r23;
        r23 = "top";
     */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x067c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0212  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5178d() {
        /*
            Method dump skipped, instructions count: 1779
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p038ui.C7342r.m5178d():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!z || this.f13706c.isEmpty()) {
            return;
        }
        m5178d();
    }
}
