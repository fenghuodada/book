package com.unity3d.services.ads.video;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.widget.VideoView;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.webview.C9620a;
import com.unity3d.services.core.webview.EnumC9627b;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.unity3d.services.ads.video.c */
/* loaded from: classes3.dex */
public class C9402c extends VideoView {

    /* renamed from: a */
    private String f18377a;

    /* renamed from: b */
    private Timer f18378b;

    /* renamed from: c */
    private Timer f18379c;

    /* renamed from: d */
    private int f18380d;

    /* renamed from: e */
    private MediaPlayer f18381e;

    /* renamed from: f */
    private Float f18382f;

    /* renamed from: g */
    private boolean f18383g;

    /* renamed from: h */
    private AudioManager f18384h;

    /* renamed from: com.unity3d.services.ads.video.c$a */
    /* loaded from: classes3.dex */
    public class C9403a extends TimerTask {
        public C9403a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            boolean z;
            try {
                z = C9402c.this.isPlaying();
            } catch (IllegalStateException e) {
                e = e;
                z = false;
            }
            try {
                C9620a.m1774c().m1784a(EnumC9627b.VIDEOPLAYER, EnumC9401b.PROGRESS, Integer.valueOf(C9402c.this.getCurrentPosition()));
            } catch (IllegalStateException e2) {
                e = e2;
                C9549a.m2023a("Exception while sending current position to webapp", e);
                C9620a.m1774c().m1784a(EnumC9627b.VIDEOPLAYER, EnumC9401b.ILLEGAL_STATE, EnumC9401b.PROGRESS, C9402c.this.f18377a, Boolean.valueOf(z));
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.video.c$b */
    /* loaded from: classes3.dex */
    public class C9404b extends TimerTask {
        public C9404b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (C9402c.this.isPlaying()) {
                return;
            }
            C9620a.m1774c().m1784a(EnumC9627b.VIDEOPLAYER, EnumC9401b.PREPARE_TIMEOUT, C9402c.this.f18377a);
            C9549a.m2017c("Video player prepare timeout: " + C9402c.this.f18377a);
        }
    }

    /* renamed from: com.unity3d.services.ads.video.c$c */
    /* loaded from: classes3.dex */
    public class C9405c implements MediaPlayer.OnPreparedListener {

        /* renamed from: a */
        final /* synthetic */ float f18387a;

        public C9405c(float f) {
            this.f18387a = f;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            C9402c.this.m2359d();
            if (mediaPlayer != null) {
                C9402c.this.f18381e = mediaPlayer;
            }
            C9402c.this.setVolume(Float.valueOf(this.f18387a));
            C9620a.m1774c().m1784a(EnumC9627b.VIDEOPLAYER, EnumC9401b.PREPARED, C9402c.this.f18377a, Integer.valueOf(mediaPlayer.getDuration()), Integer.valueOf(mediaPlayer.getVideoWidth()), Integer.valueOf(mediaPlayer.getVideoHeight()));
        }
    }

    /* renamed from: com.unity3d.services.ads.video.c$d */
    /* loaded from: classes3.dex */
    public class C9406d implements MediaPlayer.OnErrorListener {
        public C9406d() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            C9402c.this.m2359d();
            if (mediaPlayer != null) {
                C9402c.this.f18381e = mediaPlayer;
            }
            C9620a.m1774c().m1784a(EnumC9627b.VIDEOPLAYER, EnumC9401b.GENERIC_ERROR, C9402c.this.f18377a, Integer.valueOf(i), Integer.valueOf(i2));
            C9402c.this.m2358e();
            return true;
        }
    }

    /* renamed from: com.unity3d.services.ads.video.c$e */
    /* loaded from: classes3.dex */
    public class C9407e implements MediaPlayer.OnCompletionListener {
        public C9407e() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            if (mediaPlayer != null) {
                C9402c.this.f18381e = mediaPlayer;
            }
            C9620a.m1774c().m1784a(EnumC9627b.VIDEOPLAYER, EnumC9401b.COMPLETED, C9402c.this.f18377a);
            C9402c.this.m2358e();
        }
    }

    /* renamed from: com.unity3d.services.ads.video.c$f */
    /* loaded from: classes3.dex */
    public class C9408f implements MediaPlayer.OnInfoListener {
        public C9408f() {
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            C9620a.m1774c().m1784a(EnumC9627b.VIDEOPLAYER, EnumC9401b.INFO, C9402c.this.f18377a, Integer.valueOf(i), Integer.valueOf(i2));
            return true;
        }
    }

    public C9402c(Context context) {
        super(context);
        this.f18380d = 500;
        this.f18381e = null;
        this.f18382f = null;
        this.f18383g = true;
        this.f18384h = null;
    }

    /* renamed from: a */
    private void m2365a(long j) {
        Timer timer = new Timer();
        this.f18379c = timer;
        timer.schedule(new C9404b(), j);
    }

    /* renamed from: b */
    private void m2361b() {
        Timer timer = new Timer();
        this.f18378b = timer;
        C9403a c9403a = new C9403a();
        long j = this.f18380d;
        timer.scheduleAtFixedRate(c9403a, j, j);
    }

    /* renamed from: a */
    public void m2366a() {
        C9549a.m2029a();
        setOnCompletionListener(new C9407e());
        try {
            start();
            m2358e();
            m2361b();
            C9620a.m1774c().m1784a(EnumC9627b.VIDEOPLAYER, EnumC9401b.PLAY, this.f18377a);
        } catch (IllegalStateException unused) {
            C9620a.m1774c().m1784a(EnumC9627b.VIDEOPLAYER, EnumC9401b.ILLEGAL_STATE, this.f18377a, Boolean.FALSE);
        }
    }

    /* renamed from: a */
    public boolean m2362a(String str, float f, int i) {
        C9549a.m2029a();
        this.f18377a = str;
        setOnPreparedListener(new C9405c(f));
        setOnErrorListener(new C9406d());
        setInfoListenerEnabled(this.f18383g);
        if (i > 0) {
            m2365a(i);
        }
        try {
            if (Build.VERSION.SDK_INT < 26) {
                AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
                this.f18384h = audioManager;
                if (audioManager != null) {
                    audioManager.requestAudioFocus(null, 3, 2);
                }
            } else {
                setAudioFocusRequest(2);
            }
            setVideoPath(this.f18377a);
            return true;
        } catch (Exception e) {
            C9620a.m1774c().m1784a(EnumC9627b.VIDEOPLAYER, EnumC9401b.PREPARE_ERROR, this.f18377a);
            C9549a.m2023a("Error preparing video: " + this.f18377a, e);
            return false;
        }
    }

    /* renamed from: c */
    public void m2360c() {
        stopPlayback();
        m2358e();
        if (Build.VERSION.SDK_INT < 26) {
            AudioManager audioManager = this.f18384h;
            if (audioManager != null) {
                audioManager.abandonAudioFocus(null);
            }
        } else {
            setAudioFocusRequest(0);
        }
        C9620a.m1774c().m1784a(EnumC9627b.VIDEOPLAYER, EnumC9401b.STOP, this.f18377a);
    }

    /* renamed from: d */
    public void m2359d() {
        Timer timer = this.f18379c;
        if (timer != null) {
            timer.cancel();
            this.f18379c.purge();
            this.f18379c = null;
        }
    }

    /* renamed from: e */
    public void m2358e() {
        Timer timer = this.f18378b;
        if (timer != null) {
            timer.cancel();
            this.f18378b.purge();
            this.f18378b = null;
        }
    }

    public int getProgressEventInterval() {
        return this.f18380d;
    }

    public int[] getVideoViewRectangle() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        return new int[]{iArr[0], iArr[1], getMeasuredWidth(), getMeasuredHeight()};
    }

    public float getVolume() {
        return this.f18382f.floatValue();
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public void pause() {
        try {
            super.pause();
            if (Build.VERSION.SDK_INT < 26) {
                AudioManager audioManager = this.f18384h;
                if (audioManager != null) {
                    audioManager.abandonAudioFocus(null);
                }
            } else {
                setAudioFocusRequest(0);
            }
            m2358e();
            C9620a.m1774c().m1784a(EnumC9627b.VIDEOPLAYER, EnumC9401b.PAUSE, this.f18377a);
        } catch (Exception e) {
            C9620a.m1774c().m1784a(EnumC9627b.VIDEOPLAYER, EnumC9401b.PAUSE_ERROR, this.f18377a);
            C9549a.m2023a("Error pausing video", e);
        }
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i) {
        try {
            super.seekTo(i);
            C9620a.m1774c().m1784a(EnumC9627b.VIDEOPLAYER, EnumC9401b.SEEKTO, this.f18377a);
        } catch (Exception e) {
            C9620a.m1774c().m1784a(EnumC9627b.VIDEOPLAYER, EnumC9401b.SEEKTO_ERROR, this.f18377a);
            C9549a.m2023a("Error seeking video", e);
        }
    }

    public void setInfoListenerEnabled(boolean z) {
        this.f18383g = z;
        setOnInfoListener(z ? new C9408f() : null);
    }

    public void setProgressEventInterval(int i) {
        this.f18380d = i;
        if (this.f18378b != null) {
            m2358e();
            m2361b();
        }
    }

    public void setVolume(Float f) {
        try {
            this.f18381e.setVolume(f.floatValue(), f.floatValue());
            this.f18382f = f;
        } catch (Exception e) {
            C9549a.m2023a("MediaPlayer generic error", e);
        }
    }
}
