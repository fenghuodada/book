package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.activity.result.C0063d;
import androidx.datastore.preferences.protobuf.C1169e;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

@TargetApi(14)
/* renamed from: com.adcolony.sdk.j0 */
/* loaded from: classes.dex */
public final class TextureView$SurfaceTextureListenerC2142j0 extends TextureView implements MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnSeekCompleteListener, TextureView.SurfaceTextureListener {

    /* renamed from: A */
    public boolean f5222A;

    /* renamed from: B */
    public boolean f5223B;

    /* renamed from: C */
    public String f5224C;

    /* renamed from: D */
    public String f5225D;

    /* renamed from: E */
    public final C2100e2 f5226E;

    /* renamed from: F */
    public final C2135i1 f5227F;

    /* renamed from: G */
    public SurfaceTexture f5228G;

    /* renamed from: H */
    public final RectF f5229H;

    /* renamed from: I */
    public C2144b f5230I;

    /* renamed from: J */
    public ProgressBar f5231J;

    /* renamed from: K */
    public MediaPlayer f5232K;

    /* renamed from: L */
    public final C2367y1 f5233L;

    /* renamed from: M */
    public final ExecutorService f5234M;

    /* renamed from: N */
    public C2100e2 f5235N;

    /* renamed from: a */
    public float f5236a;

    /* renamed from: b */
    public float f5237b;

    /* renamed from: c */
    public float f5238c;

    /* renamed from: d */
    public float f5239d;

    /* renamed from: e */
    public int f5240e;

    /* renamed from: f */
    public boolean f5241f;

    /* renamed from: g */
    public final Paint f5242g;

    /* renamed from: h */
    public final Paint f5243h;

    /* renamed from: i */
    public int f5244i;

    /* renamed from: j */
    public int f5245j;

    /* renamed from: k */
    public int f5246k;

    /* renamed from: l */
    public int f5247l;

    /* renamed from: m */
    public final int f5248m;

    /* renamed from: n */
    public int f5249n;

    /* renamed from: o */
    public int f5250o;

    /* renamed from: p */
    public double f5251p;

    /* renamed from: q */
    public double f5252q;

    /* renamed from: r */
    public long f5253r;

    /* renamed from: s */
    public boolean f5254s;

    /* renamed from: t */
    public boolean f5255t;

    /* renamed from: u */
    public boolean f5256u;

    /* renamed from: v */
    public boolean f5257v;

    /* renamed from: w */
    public boolean f5258w;

    /* renamed from: x */
    public boolean f5259x;

    /* renamed from: y */
    public boolean f5260y;

    /* renamed from: z */
    public boolean f5261z;

    /* renamed from: com.adcolony.sdk.j0$a */
    /* loaded from: classes.dex */
    public class RunnableC2143a implements Runnable {
        public RunnableC2143a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Thread.sleep(150L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            TextureView$SurfaceTextureListenerC2142j0 textureView$SurfaceTextureListenerC2142j0 = TextureView$SurfaceTextureListenerC2142j0.this;
            if (textureView$SurfaceTextureListenerC2142j0.f5235N != null) {
                C2367y1 c2367y1 = new C2367y1();
                C2080d1.m9657k(textureView$SurfaceTextureListenerC2142j0.f5248m, c2367y1, FacebookAdapter.KEY_ID);
                C2080d1.m9660h(c2367y1, "ad_session_id", textureView$SurfaceTextureListenerC2142j0.f5225D);
                C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, true);
                textureView$SurfaceTextureListenerC2142j0.f5235N.m9641a(c2367y1).m9640b();
                textureView$SurfaceTextureListenerC2142j0.f5235N = null;
            }
        }
    }

    /* renamed from: com.adcolony.sdk.j0$b */
    /* loaded from: classes.dex */
    public class C2144b extends View {
        public C2144b(Context context) {
            super(context);
            setWillNotDraw(false);
            try {
                C2144b.class.getMethod("setLayerType", Integer.TYPE, Paint.class).invoke(this, 1, null);
            } catch (Exception unused) {
            }
        }

        @Override // android.view.View
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            TextureView$SurfaceTextureListenerC2142j0 textureView$SurfaceTextureListenerC2142j0 = TextureView$SurfaceTextureListenerC2142j0.this;
            canvas.drawArc(textureView$SurfaceTextureListenerC2142j0.f5229H, 270.0f, textureView$SurfaceTextureListenerC2142j0.f5237b, false, textureView$SurfaceTextureListenerC2142j0.f5242g);
            canvas.drawText("" + textureView$SurfaceTextureListenerC2142j0.f5240e, textureView$SurfaceTextureListenerC2142j0.f5229H.centerX(), (float) ((textureView$SurfaceTextureListenerC2142j0.f5243h.getFontMetrics().bottom * 1.35d) + textureView$SurfaceTextureListenerC2142j0.f5229H.centerY()), textureView$SurfaceTextureListenerC2142j0.f5243h);
            invalidate();
        }
    }

    public TextureView$SurfaceTextureListenerC2142j0(Context context, C2100e2 c2100e2, int i, C2135i1 c2135i1) {
        super(context);
        this.f5241f = true;
        this.f5242g = new Paint();
        this.f5243h = new Paint(1);
        this.f5229H = new RectF();
        this.f5233L = new C2367y1();
        this.f5234M = Executors.newSingleThreadExecutor();
        this.f5227F = c2135i1;
        this.f5226E = c2100e2;
        this.f5248m = i;
        setSurfaceTextureListener(this);
    }

    /* renamed from: a */
    public static boolean m9615a(TextureView$SurfaceTextureListenerC2142j0 textureView$SurfaceTextureListenerC2142j0, C2100e2 c2100e2) {
        textureView$SurfaceTextureListenerC2142j0.getClass();
        C2367y1 c2367y1 = c2100e2.f5098b;
        if (c2367y1.m9441r(FacebookAdapter.KEY_ID) == textureView$SurfaceTextureListenerC2142j0.f5248m) {
            int m9441r = c2367y1.m9441r("container_id");
            C2135i1 c2135i1 = textureView$SurfaceTextureListenerC2142j0.f5227F;
            if (m9441r == c2135i1.f5201j && c2367y1.m9436w("ad_session_id").equals(c2135i1.f5203l)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void m9614b() {
        C2367y1 c2367y1 = new C2367y1();
        C2080d1.m9660h(c2367y1, FacebookAdapter.KEY_ID, this.f5225D);
        new C2100e2(this.f5227F.f5202k, c2367y1, "AdSession.on_error").m9640b();
        this.f5254s = true;
    }

    /* renamed from: c */
    public final void m9613c() {
        if (!this.f5258w) {
            C1169e.m11129c("ADCVideoView pause() called while MediaPlayer is not prepared.", 0, 1, true);
        } else if (!this.f5256u) {
        } else {
            this.f5232K.getCurrentPosition();
            this.f5252q = this.f5232K.getDuration();
            this.f5232K.pause();
            this.f5257v = true;
        }
    }

    /* renamed from: d */
    public final void m9612d() {
        if (!this.f5258w) {
            return;
        }
        boolean z = this.f5257v;
        ExecutorService executorService = this.f5234M;
        if (!z && C2201m0.f5366d) {
            this.f5232K.start();
            try {
                executorService.submit(new RunnableC2180k0(this));
            } catch (RejectedExecutionException unused) {
                m9614b();
            }
        } else if (!this.f5254s && C2201m0.f5366d) {
            this.f5232K.start();
            this.f5257v = false;
            if (!executorService.isShutdown()) {
                try {
                    executorService.submit(new RunnableC2180k0(this));
                } catch (RejectedExecutionException unused2) {
                    m9614b();
                }
            }
            C2144b c2144b = this.f5230I;
            if (c2144b != null) {
                c2144b.invalidate();
            }
        }
        setWillNotDraw(false);
    }

    /* renamed from: e */
    public final void m9611e() {
        C1169e.m11129c("MediaPlayer stopped and released.", 0, 2, true);
        try {
            if (!this.f5254s && this.f5258w && this.f5232K.isPlaying()) {
                this.f5232K.stop();
            }
        } catch (IllegalStateException unused) {
            C1169e.m11129c("Caught IllegalStateException when calling stop on MediaPlayer", 0, 1, true);
        }
        ProgressBar progressBar = this.f5231J;
        if (progressBar != null) {
            this.f5227F.removeView(progressBar);
        }
        this.f5254s = true;
        this.f5258w = false;
        this.f5232K.release();
    }

    /* renamed from: f */
    public final void m9610f() {
        double min = Math.min(this.f5246k / this.f5249n, this.f5247l / this.f5250o);
        int i = (int) (this.f5249n * min);
        int i2 = (int) (this.f5250o * min);
        C1169e.m11129c("setMeasuredDimension to " + i + " by " + i2, 0, 2, true);
        setMeasuredDimension(i, i2);
        if (this.f5260y) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i2;
            layoutParams.gravity = 17;
            layoutParams.setMargins(0, 0, 0, 0);
            setLayoutParams(layoutParams);
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.f5254s = true;
        this.f5251p = this.f5252q;
        int i = this.f5248m;
        C2367y1 c2367y1 = this.f5233L;
        C2080d1.m9657k(i, c2367y1, FacebookAdapter.KEY_ID);
        C2135i1 c2135i1 = this.f5227F;
        C2080d1.m9657k(c2135i1.f5201j, c2367y1, "container_id");
        C2080d1.m9660h(c2367y1, "ad_session_id", this.f5225D);
        C2080d1.m9663e(c2367y1, "elapsed", this.f5251p);
        C2080d1.m9663e(c2367y1, "duration", this.f5252q);
        new C2100e2(c2135i1.f5202k, c2367y1, "VideoView.on_progress").m9640b();
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        m9614b();
        StringBuilder sb = new StringBuilder();
        sb.append("MediaPlayer error: " + i + "," + i2);
        C1169e.m11129c(sb.toString(), 0, 0, false);
        return true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        m9610f();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        this.f5258w = true;
        boolean z = this.f5223B;
        C2135i1 c2135i1 = this.f5227F;
        if (z) {
            c2135i1.removeView(this.f5231J);
        }
        if (this.f5260y) {
            this.f5249n = mediaPlayer.getVideoWidth();
            this.f5250o = mediaPlayer.getVideoHeight();
            m9610f();
            C2201m0.m9588d().m9689n().m9706d("MediaPlayer getVideoWidth = " + mediaPlayer.getVideoWidth(), 0, 2, true);
            C1169e.m11129c("MediaPlayer getVideoHeight = " + mediaPlayer.getVideoHeight(), 0, 2, true);
        }
        C2367y1 c2367y1 = new C2367y1();
        C2080d1.m9657k(this.f5248m, c2367y1, FacebookAdapter.KEY_ID);
        C2080d1.m9657k(c2135i1.f5201j, c2367y1, "container_id");
        C2080d1.m9660h(c2367y1, "ad_session_id", this.f5225D);
        new C2100e2(c2135i1.f5202k, c2367y1, "VideoView.on_ready").m9640b();
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        ExecutorService executorService = this.f5234M;
        if (executorService == null || executorService.isShutdown()) {
            return;
        }
        try {
            executorService.submit(new RunnableC2143a());
        } catch (RejectedExecutionException unused) {
            m9614b();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (surfaceTexture != null && !this.f5259x) {
            try {
                this.f5232K.setSurface(new Surface(surfaceTexture));
            } catch (IllegalStateException unused) {
                C2201m0.m9588d().m9689n().m9706d("IllegalStateException thrown when calling MediaPlayer.setSurface()", 0, 0, false);
                m9614b();
            }
            this.f5228G = surfaceTexture;
            return;
        }
        C1169e.m11129c(C0063d.m13053a("Null texture provided by system's onSurfaceTextureAvailable or ", "MediaPlayer has been destroyed."), 0, 0, true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f5228G = surfaceTexture;
        if (this.f5259x) {
            surfaceTexture.release();
            return true;
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f5228G = surfaceTexture;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f5228G = surfaceTexture;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C2100e2 c2100e2;
        C2058b3 m9588d = C2201m0.m9588d();
        C2145j1 m9692k = m9588d.m9692k();
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        C2367y1 c2367y1 = new C2367y1();
        C2080d1.m9657k(this.f5248m, c2367y1, "view_id");
        C2080d1.m9660h(c2367y1, "ad_session_id", this.f5225D);
        C2080d1.m9657k(this.f5244i + x, c2367y1, "container_x");
        C2080d1.m9657k(this.f5245j + y, c2367y1, "container_y");
        C2080d1.m9657k(x, c2367y1, "view_x");
        C2080d1.m9657k(y, c2367y1, "view_y");
        C2135i1 c2135i1 = this.f5227F;
        C2080d1.m9657k(c2135i1.f5201j, c2367y1, FacebookAdapter.KEY_ID);
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                int action2 = (motionEvent.getAction() & 65280) >> 8;
                                C2080d1.m9657k(((int) motionEvent.getX(action2)) + this.f5244i, c2367y1, "container_x");
                                C2080d1.m9657k(((int) motionEvent.getY(action2)) + this.f5245j, c2367y1, "container_y");
                                C2080d1.m9657k((int) motionEvent.getX(action2), c2367y1, "view_x");
                                C2080d1.m9657k((int) motionEvent.getY(action2), c2367y1, "view_y");
                                if (!c2135i1.f5212u) {
                                    m9588d.f4996n = m9692k.f5269f.get(this.f5225D);
                                }
                                c2100e2 = new C2100e2(c2135i1.f5202k, c2367y1, "AdContainer.on_touch_ended");
                            }
                            return true;
                        }
                        int action3 = (motionEvent.getAction() & 65280) >> 8;
                        C2080d1.m9657k(((int) motionEvent.getX(action3)) + this.f5244i, c2367y1, "container_x");
                        C2080d1.m9657k(((int) motionEvent.getY(action3)) + this.f5245j, c2367y1, "container_y");
                        C2080d1.m9657k((int) motionEvent.getX(action3), c2367y1, "view_x");
                        C2080d1.m9657k((int) motionEvent.getY(action3), c2367y1, "view_y");
                        c2100e2 = new C2100e2(c2135i1.f5202k, c2367y1, "AdContainer.on_touch_began");
                    } else {
                        c2100e2 = new C2100e2(c2135i1.f5202k, c2367y1, "AdContainer.on_touch_cancelled");
                    }
                } else {
                    c2100e2 = new C2100e2(c2135i1.f5202k, c2367y1, "AdContainer.on_touch_moved");
                }
            } else {
                if (!c2135i1.f5212u) {
                    m9588d.f4996n = m9692k.f5269f.get(this.f5225D);
                }
                c2100e2 = new C2100e2(c2135i1.f5202k, c2367y1, "AdContainer.on_touch_ended");
            }
        } else {
            c2100e2 = new C2100e2(c2135i1.f5202k, c2367y1, "AdContainer.on_touch_began");
        }
        c2100e2.m9640b();
        return true;
    }
}
