package com.vungle.warren.p058ui.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.VideoView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.vungle.warren.p058ui.C10011f;
import com.vungle.warren.p058ui.presenter.C10012a;
import com.vungle.warren.utility.C10091l;
import com.vungle.warren.utility.ViewUtility;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;

/* renamed from: com.vungle.warren.ui.view.FullAdWidget */
/* loaded from: classes3.dex */
public final class FullAdWidget extends RelativeLayout {

    /* renamed from: a */
    public final HashMap f20188a;

    /* renamed from: b */
    public final Window f20189b;

    /* renamed from: c */
    public final VideoView f20190c;

    /* renamed from: d */
    public final RelativeLayout f20191d;
    @Nullable

    /* renamed from: e */
    public WebView f20192e;

    /* renamed from: f */
    public final ProgressBar f20193f;

    /* renamed from: g */
    public final ImageView f20194g;

    /* renamed from: h */
    public final ImageView f20195h;

    /* renamed from: i */
    public final ImageView f20196i;

    /* renamed from: j */
    public final ImageView f20197j;

    /* renamed from: k */
    public InterfaceC10037g f20198k;

    /* renamed from: l */
    public InterfaceC10054k f20199l;

    /* renamed from: m */
    public MediaPlayer.OnPreparedListener f20200m;

    /* renamed from: n */
    public MediaPlayer.OnErrorListener f20201n;

    /* renamed from: o */
    public MediaPlayer.OnCompletionListener f20202o;

    /* renamed from: p */
    public int f20203p;

    /* renamed from: q */
    public final GestureDetector f20204q;

    /* renamed from: r */
    public final RunnableC10031a f20205r;

    /* renamed from: s */
    public final ViewTreeObserver$OnGlobalLayoutListenerC10033c f20206s;

    /* renamed from: t */
    public final View$OnClickListenerC10034d f20207t;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.vungle.warren.ui.view.FullAdWidget$ViewEvent */
    /* loaded from: classes3.dex */
    public @interface ViewEvent {
        public static final int CLOSE_CLICK = 1;
        public static final int CTA_CLICK = 2;
        public static final int MUTE_CLICK = 3;
        public static final int PRIVACY_CLICK = 4;
        public static final int VIDEO_CLICK = 5;
    }

    /* renamed from: com.vungle.warren.ui.view.FullAdWidget$a */
    /* loaded from: classes3.dex */
    public class RunnableC10031a implements Runnable {
        public RunnableC10031a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            FullAdWidget.m1319a(FullAdWidget.this);
        }
    }

    /* renamed from: com.vungle.warren.ui.view.FullAdWidget$b */
    /* loaded from: classes3.dex */
    public class C10032b extends GestureDetector.SimpleOnGestureListener {
        public C10032b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            FullAdWidget fullAdWidget = FullAdWidget.this;
            fullAdWidget.f20207t.onClick(fullAdWidget.f20191d);
            return true;
        }
    }

    /* renamed from: com.vungle.warren.ui.view.FullAdWidget$c */
    /* loaded from: classes3.dex */
    public class ViewTreeObserver$OnGlobalLayoutListenerC10033c implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserver$OnGlobalLayoutListenerC10033c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            FullAdWidget fullAdWidget = FullAdWidget.this;
            fullAdWidget.getViewTreeObserver().removeOnGlobalLayoutListener(fullAdWidget.f20206s);
            FullAdWidget.m1319a(fullAdWidget);
        }
    }

    /* renamed from: com.vungle.warren.ui.view.FullAdWidget$d */
    /* loaded from: classes3.dex */
    public class View$OnClickListenerC10034d implements View.OnClickListener {
        public View$OnClickListenerC10034d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int intValue;
            String str;
            String str2;
            float f;
            FullAdWidget fullAdWidget = FullAdWidget.this;
            InterfaceC10037g interfaceC10037g = fullAdWidget.f20198k;
            if (interfaceC10037g != null) {
                Integer num = (Integer) fullAdWidget.f20188a.get(view);
                if (num == null) {
                    intValue = -1;
                } else {
                    intValue = num.intValue();
                }
                C10048h c10048h = C10048h.this;
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue != 3) {
                            if (intValue != 4) {
                                if (intValue != 5 || !c10048h.f20233j) {
                                    return;
                                }
                            } else {
                                C10012a c10012a = c10048h.f20230g;
                                c10012a.f20130n.mo1305e(null, "https://vungle.com/privacy/", new C10011f(c10012a.f20135s, c10012a.f20122f), null);
                                return;
                            }
                        } else {
                            MediaPlayer mediaPlayer = c10048h.f20232i;
                            if (mediaPlayer != null) {
                                boolean z = true ^ c10048h.f20231h;
                                c10048h.f20231h = z;
                                if (mediaPlayer != null) {
                                    if (z) {
                                        f = 0.0f;
                                    } else {
                                        f = 1.0f;
                                    }
                                    try {
                                        mediaPlayer.setVolume(f, f);
                                    } catch (IllegalStateException e) {
                                        Log.i(c10048h.f20215c, "Exception On Mute/Unmute", e);
                                    }
                                }
                                C10012a c10012a2 = c10048h.f20230g;
                                boolean z2 = c10048h.f20231h;
                                c10012a2.f20127k = z2;
                                if (z2) {
                                    str = "mute";
                                    str2 = "true";
                                } else {
                                    str = "unmute";
                                    str2 = "false";
                                }
                                c10012a2.m1343t(str, str2);
                                c10048h.f20216d.setMuted(c10048h.f20231h);
                                return;
                            }
                            return;
                        }
                    }
                    c10048h.f20230g.m1347p();
                    return;
                }
                c10048h.f20230g.mo1331n();
            }
        }
    }

    /* renamed from: com.vungle.warren.ui.view.FullAdWidget$e */
    /* loaded from: classes3.dex */
    public static class C10035e extends ContextWrapper {
        public C10035e(Context context) {
            super(context);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public final Object getSystemService(String str) {
            return "audio".equals(str) ? getApplicationContext().getSystemService(str) : super.getSystemService(str);
        }
    }

    /* renamed from: com.vungle.warren.ui.view.FullAdWidget$f */
    /* loaded from: classes3.dex */
    public static class RunnableC10036f implements Runnable {

        /* renamed from: a */
        public final WebView f20212a;

        public RunnableC10036f(WebView webView) {
            this.f20212a = webView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            WebView webView = this.f20212a;
            webView.stopLoading();
            webView.setWebViewClient(null);
            if (Build.VERSION.SDK_INT >= 29) {
                webView.setWebViewRenderProcessClient(null);
            }
            webView.loadData("", null, null);
            webView.destroy();
        }
    }

    /* renamed from: com.vungle.warren.ui.view.FullAdWidget$g */
    /* loaded from: classes3.dex */
    public interface InterfaceC10037g {
    }

    public FullAdWidget(Context context, Window window) throws InstantiationException {
        super(context);
        HashMap hashMap = new HashMap();
        this.f20188a = hashMap;
        C10032b c10032b = new C10032b();
        this.f20206s = new ViewTreeObserver$OnGlobalLayoutListenerC10033c();
        this.f20207t = new View$OnClickListenerC10034d();
        this.f20189b = window;
        Resources resources = getResources();
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(layoutParams);
        this.f20205r = new RunnableC10031a();
        VideoView videoView = new VideoView(new C10035e(context));
        this.f20190c = videoView;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(13);
        videoView.setLayoutParams(layoutParams2);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f20191d = relativeLayout;
        relativeLayout.setTag("videoViewContainer");
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.addView(videoView, layoutParams2);
        addView(relativeLayout, layoutParams);
        this.f20204q = new GestureDetector(context, c10032b);
        try {
            WebView webView = new WebView(context);
            this.f20192e = webView;
            webView.setLayoutParams(layoutParams);
            this.f20192e.setTag("webView");
            addView(this.f20192e, layoutParams);
            ProgressBar progressBar = new ProgressBar(context, null, 16842872);
            this.f20193f = progressBar;
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, (int) TypedValue.applyDimension(1, 4.0f, resources.getDisplayMetrics()));
            layoutParams3.addRule(12);
            progressBar.setLayoutParams(layoutParams3);
            progressBar.setMax(100);
            progressBar.setIndeterminate(false);
            progressBar.setVisibility(4);
            addView(progressBar);
            int applyDimension = (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics());
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(applyDimension, applyDimension);
            int applyDimension2 = (int) TypedValue.applyDimension(1, 12.0f, resources.getDisplayMetrics());
            layoutParams4.setMargins(applyDimension2, applyDimension2, applyDimension2, applyDimension2);
            ImageView imageView = new ImageView(context);
            this.f20194g = imageView;
            imageView.setImageBitmap(ViewUtility.m1288b(ViewUtility.Asset.unMute, context));
            imageView.setLayoutParams(layoutParams4);
            imageView.setVisibility(8);
            addView(imageView);
            RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(applyDimension, applyDimension);
            layoutParams5.setMargins(applyDimension2, applyDimension2, applyDimension2, applyDimension2);
            ImageView imageView2 = new ImageView(context);
            this.f20195h = imageView2;
            imageView2.setTag("closeButton");
            imageView2.setImageBitmap(ViewUtility.m1288b(ViewUtility.Asset.close, context));
            layoutParams5.addRule(11);
            imageView2.setLayoutParams(layoutParams5);
            imageView2.setVisibility(8);
            addView(imageView2);
            RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(applyDimension, applyDimension);
            layoutParams6.addRule(12);
            layoutParams6.addRule(11);
            layoutParams6.setMargins(applyDimension2, applyDimension2, applyDimension2, applyDimension2);
            ImageView imageView3 = new ImageView(context);
            this.f20196i = imageView3;
            imageView3.setTag("ctaOverlay");
            imageView3.setLayoutParams(layoutParams6);
            imageView3.setImageBitmap(ViewUtility.m1288b(ViewUtility.Asset.cta, getContext()));
            imageView3.setVisibility(8);
            addView(imageView3);
            RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(applyDimension, applyDimension);
            layoutParams7.addRule(12);
            layoutParams7.addRule(9);
            layoutParams7.setMargins(applyDimension2, applyDimension2, applyDimension2, applyDimension2);
            ImageView imageView4 = new ImageView(context);
            this.f20197j = imageView4;
            imageView4.setLayoutParams(layoutParams7);
            imageView4.setVisibility(8);
            addView(imageView4);
            m1318b(1, imageView2);
            m1318b(2, imageView3);
            m1318b(3, imageView);
            m1318b(4, imageView4);
            hashMap.put(relativeLayout, 5);
            relativeLayout.setOnTouchListener(new View$OnTouchListenerC10043c(this));
            videoView.setOnPreparedListener(new C10044d(this));
            videoView.setOnErrorListener(new C10045e(this));
            videoView.setOnCompletionListener(new C10046f(this));
            WebView webView2 = this.f20192e;
            if (webView2 != null) {
                webView2.setOnTouchListener(new View$OnTouchListenerC10047g(this));
            }
            WebView webView3 = this.f20192e;
            if (webView3 != null) {
                webView3.getSettings().setMediaPlaybackRequiresUserGesture(false);
                this.f20192e.setVisibility(8);
            }
            relativeLayout.setVisibility(8);
        } catch (Exception e) {
            throw new InstantiationException(e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m1319a(FullAdWidget fullAdWidget) {
        WindowInsetsController insetsController;
        int statusBars;
        int navigationBars;
        int i = Build.VERSION.SDK_INT;
        Window window = fullAdWidget.f20189b;
        if (i >= 30) {
            window.setDecorFitsSystemWindows(false);
            insetsController = window.getInsetsController();
            if (insetsController != null) {
                statusBars = WindowInsets.Type.statusBars();
                navigationBars = WindowInsets.Type.navigationBars();
                insetsController.hide(statusBars | navigationBars);
                insetsController.setSystemBarsBehavior(2);
                return;
            }
            return;
        }
        window.getDecorView().setSystemUiVisibility(5894);
    }

    /* renamed from: b */
    public final void m1318b(int i, ImageView imageView) {
        this.f20188a.put(imageView, Integer.valueOf(i));
        imageView.setOnClickListener(this.f20207t);
    }

    /* renamed from: c */
    public final void m1317c(long j) {
        WebView webView = this.f20192e;
        if (webView == null) {
            return;
        }
        webView.removeJavascriptInterface("Android");
        this.f20192e.setWebChromeClient(null);
        removeView(this.f20192e);
        this.f20192e.removeAllViews();
        if (j <= 0) {
            WebView webView2 = this.f20192e;
            webView2.stopLoading();
            webView2.setWebViewClient(null);
            if (Build.VERSION.SDK_INT >= 29) {
                webView2.setWebViewRenderProcessClient(null);
            }
            webView2.loadData("", null, null);
            webView2.destroy();
        } else {
            C10091l c10091l = new C10091l();
            c10091l.f20314a.postAtTime(new RunnableC10036f(this.f20192e), SystemClock.uptimeMillis() + j);
        }
        this.f20192e = null;
    }

    /* renamed from: d */
    public final void m1316d(String str) {
        if (this.f20192e == null) {
            return;
        }
        Log.d("FullAdWidget", "loadJs: " + str);
        this.f20192e.loadUrl(str);
        this.f20192e.setVisibility(0);
        RelativeLayout relativeLayout = this.f20191d;
        relativeLayout.setVisibility(8);
        relativeLayout.setOnClickListener(null);
        this.f20193f.setVisibility(8);
        this.f20195h.setVisibility(8);
        this.f20194g.setVisibility(8);
        this.f20196i.setVisibility(8);
        this.f20197j.setVisibility(8);
    }

    public int getCurrentVideoPosition() {
        return this.f20190c.getCurrentPosition();
    }

    public String getUrl() {
        WebView webView = this.f20192e;
        if (webView == null) {
            return null;
        }
        return webView.getUrl();
    }

    public int getVideoDuration() {
        return this.f20190c.getDuration();
    }

    @Nullable
    @VisibleForTesting
    public WebView getWebView() {
        return this.f20192e;
    }

    public void setCtaEnabled(boolean z) {
        this.f20196i.setVisibility(z ? 0 : 8);
    }

    public void setMuted(boolean z) {
        Bitmap m1288b = ViewUtility.m1288b(ViewUtility.Asset.mute, getContext());
        Bitmap m1288b2 = ViewUtility.m1288b(ViewUtility.Asset.unMute, getContext());
        ImageView imageView = this.f20194g;
        if (!z) {
            m1288b = m1288b2;
        }
        imageView.setImageBitmap(m1288b);
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.f20202o = onCompletionListener;
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        this.f20201n = onErrorListener;
    }

    public void setOnItemClickListener(InterfaceC10037g interfaceC10037g) {
        this.f20198k = interfaceC10037g;
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.f20200m = onPreparedListener;
    }

    public void setOnViewTouchListener(InterfaceC10054k interfaceC10054k) {
        this.f20199l = interfaceC10054k;
    }
}
