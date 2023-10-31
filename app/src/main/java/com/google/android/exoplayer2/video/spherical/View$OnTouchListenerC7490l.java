package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.BinderThread;
import com.google.android.exoplayer2.video.spherical.C7478d;
import com.google.android.exoplayer2.video.spherical.C7487k;

/* renamed from: com.google.android.exoplayer2.video.spherical.l */
/* loaded from: classes.dex */
public final class View$OnTouchListenerC7490l extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, C7478d.InterfaceC7479a {

    /* renamed from: c */
    public final InterfaceC7491a f14205c;

    /* renamed from: e */
    public final GestureDetector f14207e;

    /* renamed from: a */
    public final PointF f14203a = new PointF();

    /* renamed from: b */
    public final PointF f14204b = new PointF();

    /* renamed from: d */
    public final float f14206d = 25.0f;

    /* renamed from: f */
    public volatile float f14208f = 3.1415927f;

    /* renamed from: com.google.android.exoplayer2.video.spherical.l$a */
    /* loaded from: classes.dex */
    public interface InterfaceC7491a {
    }

    public View$OnTouchListenerC7490l(Context context, C7487k.C7488a c7488a) {
        this.f14205c = c7488a;
        this.f14207e = new GestureDetector(context, this);
    }

    @Override // com.google.android.exoplayer2.video.spherical.C7478d.InterfaceC7479a
    @BinderThread
    /* renamed from: a */
    public final void mo4904a(float[] fArr, float f) {
        this.f14208f = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.f14203a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.f14203a.x) / this.f14206d;
        float y = motionEvent2.getY();
        PointF pointF = this.f14203a;
        float f3 = (y - pointF.y) / this.f14206d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f14208f;
        float cos = (float) Math.cos(d);
        float sin = (float) Math.sin(d);
        PointF pointF2 = this.f14204b;
        pointF2.x -= (cos * x) - (sin * f3);
        float f4 = (cos * f3) + (sin * x) + pointF2.y;
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        InterfaceC7491a interfaceC7491a = this.f14205c;
        PointF pointF3 = this.f14204b;
        C7487k.C7488a c7488a = (C7487k.C7488a) interfaceC7491a;
        synchronized (c7488a) {
            float f5 = pointF3.y;
            c7488a.f14198g = f5;
            Matrix.setRotateM(c7488a.f14196e, 0, -f5, (float) Math.cos(c7488a.f14199h), (float) Math.sin(c7488a.f14199h), 0.0f);
            Matrix.setRotateM(c7488a.f14197f, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return C7487k.this.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f14207e.onTouchEvent(motionEvent);
    }
}
