package com.unity3d.services.ads.api;

import com.unity3d.services.ads.video.C9402c;
import com.unity3d.services.ads.video.EnumC9400a;
import com.unity3d.services.ads.video.EnumC9401b;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.misc.C9564j;
import com.unity3d.services.core.webview.EnumC9627b;
import com.unity3d.services.core.webview.bridge.C9644l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

/* loaded from: classes3.dex */
public class VideoPlayer {

    /* renamed from: a */
    private static C9402c f18186a;

    /* renamed from: com.unity3d.services.ads.api.VideoPlayer$a */
    /* loaded from: classes3.dex */
    public static class RunnableC9310a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Integer f18187a;

        public RunnableC9310a(Integer num) {
            this.f18187a = num;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (VideoPlayer.getVideoPlayerView() != null) {
                VideoPlayer.getVideoPlayerView().setProgressEventInterval(this.f18187a.intValue());
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.api.VideoPlayer$b */
    /* loaded from: classes3.dex */
    public static class RunnableC9311b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f18188a;

        /* renamed from: b */
        final /* synthetic */ Double f18189b;

        /* renamed from: c */
        final /* synthetic */ Integer f18190c;

        public RunnableC9311b(String str, Double d, Integer num) {
            this.f18188a = str;
            this.f18189b = d;
            this.f18190c = num;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (VideoPlayer.getVideoPlayerView() != null) {
                VideoPlayer.getVideoPlayerView().m2362a(this.f18188a, this.f18189b.floatValue(), this.f18190c.intValue());
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.api.VideoPlayer$c */
    /* loaded from: classes3.dex */
    public static class RunnableC9312c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (VideoPlayer.getVideoPlayerView() != null) {
                VideoPlayer.getVideoPlayerView().m2366a();
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.api.VideoPlayer$d */
    /* loaded from: classes3.dex */
    public static class RunnableC9313d implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (VideoPlayer.getVideoPlayerView() != null) {
                VideoPlayer.getVideoPlayerView().pause();
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.api.VideoPlayer$e */
    /* loaded from: classes3.dex */
    public static class RunnableC9314e implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            if (VideoPlayer.getVideoPlayerView() != null) {
                VideoPlayer.getVideoPlayerView().m2360c();
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.api.VideoPlayer$f */
    /* loaded from: classes3.dex */
    public static class RunnableC9315f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Integer f18191a;

        public RunnableC9315f(Integer num) {
            this.f18191a = num;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (VideoPlayer.getVideoPlayerView() != null) {
                VideoPlayer.getVideoPlayerView().seekTo(this.f18191a.intValue());
            }
        }
    }

    @WebViewExposed
    public static void getCurrentPosition(C9644l c9644l) {
        if (getVideoPlayerView() != null) {
            c9644l.m1736a(Integer.valueOf(getVideoPlayerView().getCurrentPosition()));
        } else {
            c9644l.m1737a(EnumC9400a.VIDEOVIEW_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void getProgressEventInterval(C9644l c9644l) {
        if (getVideoPlayerView() != null) {
            c9644l.m1736a(Integer.valueOf(getVideoPlayerView().getProgressEventInterval()));
        } else {
            c9644l.m1737a(EnumC9400a.VIDEOVIEW_NULL, new Object[0]);
        }
    }

    public static C9402c getVideoPlayerView() {
        return f18186a;
    }

    @WebViewExposed
    public static void getVideoViewRectangle(C9644l c9644l) {
        C9402c videoPlayerView = getVideoPlayerView();
        if (videoPlayerView == null) {
            c9644l.m1737a(EnumC9400a.VIDEOVIEW_NULL, new Object[0]);
            return;
        }
        int[] videoViewRectangle = videoPlayerView.getVideoViewRectangle();
        c9644l.m1736a(Integer.valueOf(videoViewRectangle[0]), Integer.valueOf(videoViewRectangle[1]), Integer.valueOf(videoViewRectangle[2]), Integer.valueOf(videoViewRectangle[3]));
    }

    @WebViewExposed
    public static void getVolume(C9644l c9644l) {
        if (getVideoPlayerView() != null) {
            c9644l.m1736a(Float.valueOf(getVideoPlayerView().getVolume()));
        } else {
            c9644l.m1737a(EnumC9400a.VIDEOVIEW_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void pause(C9644l c9644l) {
        C9549a.m2019b("Pausing current video");
        C9564j.m1991a(new RunnableC9313d());
        if (getVideoPlayerView() != null) {
            c9644l.m1736a(new Object[0]);
        } else {
            c9644l.m1737a(EnumC9400a.VIDEOVIEW_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void play(C9644l c9644l) {
        C9549a.m2019b("Starting playback of prepared video");
        C9564j.m1991a(new RunnableC9312c());
        if (getVideoPlayerView() != null) {
            c9644l.m1736a(new Object[0]);
        } else {
            c9644l.m1737a(EnumC9400a.VIDEOVIEW_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void prepare(String str, Double d, C9644l c9644l) {
        prepare(str, d, 0, c9644l);
    }

    @WebViewExposed
    public static void prepare(String str, Double d, Integer num, C9644l c9644l) {
        C9549a.m2019b("Preparing video for playback: " + str);
        C9564j.m1991a(new RunnableC9311b(str, d, num));
        if (getVideoPlayerView() != null) {
            c9644l.m1736a(str);
        } else {
            c9644l.m1737a(EnumC9400a.VIDEOVIEW_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void seekTo(Integer num, C9644l c9644l) {
        C9549a.m2019b("Seeking video to time: " + num);
        C9564j.m1991a(new RunnableC9315f(num));
        if (getVideoPlayerView() != null) {
            c9644l.m1736a(new Object[0]);
        } else {
            c9644l.m1737a(EnumC9400a.VIDEOVIEW_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setInfoListenerEnabled(boolean z, C9644l c9644l) {
        if (getVideoPlayerView() == null) {
            c9644l.m1737a(EnumC9400a.VIDEOVIEW_NULL, new Object[0]);
            return;
        }
        getVideoPlayerView().setInfoListenerEnabled(z);
        c9644l.m1736a(EnumC9627b.VIDEOPLAYER, EnumC9401b.INFO, Boolean.valueOf(z));
    }

    @WebViewExposed
    public static void setProgressEventInterval(Integer num, C9644l c9644l) {
        C9564j.m1991a(new RunnableC9310a(num));
        if (getVideoPlayerView() != null) {
            c9644l.m1736a(new Object[0]);
        } else {
            c9644l.m1737a(EnumC9400a.VIDEOVIEW_NULL, new Object[0]);
        }
    }

    public static void setVideoPlayerView(C9402c c9402c) {
        f18186a = c9402c;
    }

    @WebViewExposed
    public static void setVolume(Double d, C9644l c9644l) {
        C9549a.m2019b("Setting video volume: " + d);
        if (getVideoPlayerView() == null) {
            c9644l.m1737a(EnumC9400a.VIDEOVIEW_NULL, new Object[0]);
            return;
        }
        getVideoPlayerView().setVolume(Float.valueOf(d.floatValue()));
        c9644l.m1736a(d);
    }

    @WebViewExposed
    public static void stop(C9644l c9644l) {
        C9549a.m2019b("Stopping current video");
        C9564j.m1991a(new RunnableC9314e());
        if (getVideoPlayerView() != null) {
            c9644l.m1736a(new Object[0]);
        } else {
            c9644l.m1737a(EnumC9400a.VIDEOVIEW_NULL, new Object[0]);
        }
    }
}
