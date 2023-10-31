package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.utils.C3294g;
import com.applovin.sdk.AppLovinSdkUtils;

/* loaded from: classes.dex */
public class AppLovinTouchToClickListener implements View.OnTouchListener {

    /* renamed from: a */
    private final long f6355a;

    /* renamed from: b */
    private final int f6356b;

    /* renamed from: c */
    private final int f6357c;

    /* renamed from: d */
    private final ClickRecognitionState f6358d;

    /* renamed from: e */
    private long f6359e;

    /* renamed from: f */
    private PointF f6360f;

    /* renamed from: g */
    private boolean f6361g;

    /* renamed from: h */
    private final Context f6362h;

    /* renamed from: i */
    private final OnClickListener f6363i;

    /* loaded from: classes.dex */
    public enum ClickRecognitionState {
        DISABLED,
        ACTION_DOWN,
        ACTION_POINTER_UP,
        ACTION_UP
    }

    /* loaded from: classes.dex */
    public interface OnClickListener {
        void onClick(View view, PointF pointF);
    }

    public AppLovinTouchToClickListener(C3214m c3214m, C3109b<Integer> c3109b, Context context, OnClickListener onClickListener) {
        this.f6355a = ((Long) c3214m.m7456a(C3109b.f7806aK)).longValue();
        this.f6356b = ((Integer) c3214m.m7456a(C3109b.f7807aL)).intValue();
        this.f6357c = AppLovinSdkUtils.dpToPx(context, ((Integer) c3214m.m7456a(C3109b.f7809aN)).intValue());
        this.f6358d = ClickRecognitionState.values()[((Integer) c3214m.m7456a(c3109b)).intValue()];
        this.f6362h = context;
        this.f6363i = onClickListener;
    }

    /* renamed from: a */
    private float m9184a(float f) {
        return f / this.f6362h.getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    private float m9183a(PointF pointF, PointF pointF2) {
        float f = pointF.x - pointF2.x;
        float f2 = pointF.y - pointF2.y;
        return m9184a((float) Math.sqrt((f2 * f2) + (f * f)));
    }

    /* renamed from: a */
    private void m9181a(View view, MotionEvent motionEvent) {
        this.f6363i.onClick(view, new PointF(motionEvent.getRawX(), motionEvent.getRawY()));
        this.f6361g = true;
    }

    /* renamed from: a */
    private boolean m9182a(MotionEvent motionEvent) {
        if (this.f6357c <= 0) {
            return true;
        }
        Point m7027a = C3294g.m7027a(this.f6362h);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        int i = this.f6357c;
        return rawX >= ((float) i) && rawY >= ((float) i) && rawX <= ((float) (m7027a.x - i)) && rawY <= ((float) (m7027a.y - i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r8.f6358d != com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState.ACTION_POINTER_UP) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
        if (r2 >= r4) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
        if (r0 >= r2) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
        if (m9182a(r10) != false) goto L10;
     */
    @Override // android.view.View.OnTouchListener
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
        /*
            r8 = this;
            int r0 = r10.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L5e
            if (r0 == r1) goto L19
            r2 = 6
            if (r0 == r2) goto Le
            goto L86
        Le:
            boolean r0 = r8.f6361g
            if (r0 != 0) goto L86
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r0 = r8.f6358d
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r2 = com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState.ACTION_POINTER_UP
            if (r0 != r2) goto L86
            goto L6a
        L19:
            boolean r0 = r8.f6361g
            if (r0 != 0) goto L24
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r0 = r8.f6358d
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r2 = com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState.ACTION_UP
            if (r0 != r2) goto L24
            goto L6a
        L24:
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r0 = r8.f6358d
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r2 = com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState.DISABLED
            if (r0 != r2) goto L86
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r8.f6359e
            long r2 = r2 - r4
            android.graphics.PointF r0 = r8.f6360f
            android.graphics.PointF r4 = new android.graphics.PointF
            float r5 = r10.getX()
            float r6 = r10.getY()
            r4.<init>(r5, r6)
            float r0 = r8.m9183a(r0, r4)
            boolean r4 = r8.f6361g
            if (r4 != 0) goto L86
            long r4 = r8.f6355a
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L54
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L86
        L54:
            int r2 = r8.f6356b
            if (r2 < 0) goto L6a
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L86
            goto L6a
        L5e:
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r0 = r8.f6358d
            com.applovin.impl.adview.AppLovinTouchToClickListener$ClickRecognitionState r2 = com.applovin.impl.adview.AppLovinTouchToClickListener.ClickRecognitionState.ACTION_DOWN
            if (r0 != r2) goto L6e
            boolean r0 = r8.m9182a(r10)
            if (r0 == 0) goto L86
        L6a:
            r8.m9181a(r9, r10)
            goto L86
        L6e:
            long r2 = android.os.SystemClock.elapsedRealtime()
            r8.f6359e = r2
            android.graphics.PointF r9 = new android.graphics.PointF
            float r0 = r10.getX()
            float r10 = r10.getY()
            r9.<init>(r0, r10)
            r8.f6360f = r9
            r9 = 0
            r8.f6361g = r9
        L86:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.AppLovinTouchToClickListener.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
