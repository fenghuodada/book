package com.vungle.warren.p058ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.VideoView;
import androidx.annotation.NonNull;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.model.Report;
import com.vungle.warren.p058ui.InterfaceC10008d;
import com.vungle.warren.p058ui.InterfaceC9998a;
import com.vungle.warren.p058ui.contract.InterfaceC10005c;
import com.vungle.warren.p058ui.presenter.C10012a;
import com.vungle.warren.p058ui.view.FullAdWidget;
import com.vungle.warren.utility.ViewUtility;
import java.io.File;
import java.util.Locale;

/* renamed from: com.vungle.warren.ui.view.h */
/* loaded from: classes3.dex */
public final class C10048h extends AbstractC10038a<C10012a> implements InterfaceC10005c, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {

    /* renamed from: g */
    public C10012a f20230g;

    /* renamed from: h */
    public boolean f20231h;

    /* renamed from: i */
    public MediaPlayer f20232i;

    /* renamed from: j */
    public boolean f20233j;

    /* renamed from: k */
    public RunnableC10051i f20234k;

    /* renamed from: l */
    public final Handler f20235l;

    /* renamed from: com.vungle.warren.ui.view.h$a */
    /* loaded from: classes3.dex */
    public class C10049a implements FullAdWidget.InterfaceC10037g {
        public C10049a() {
        }
    }

    /* renamed from: com.vungle.warren.ui.view.h$b */
    /* loaded from: classes3.dex */
    public class C10050b implements MediaPlayer.OnCompletionListener {
        public C10050b() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public final void onCompletion(MediaPlayer mediaPlayer) {
            C10048h c10048h = C10048h.this;
            Log.d(c10048h.f20215c, "mediaplayer onCompletion");
            RunnableC10051i runnableC10051i = c10048h.f20234k;
            if (runnableC10051i != null) {
                c10048h.f20235l.removeCallbacks(runnableC10051i);
            }
            c10048h.f20230g.m1345r(mediaPlayer.getDuration(), mediaPlayer.getDuration());
        }
    }

    public C10048h(@NonNull Context context, @NonNull FullAdWidget fullAdWidget, @NonNull InterfaceC10008d interfaceC10008d, @NonNull InterfaceC9998a interfaceC9998a) {
        super(context, fullAdWidget, interfaceC10008d, interfaceC9998a);
        this.f20231h = false;
        this.f20233j = false;
        this.f20235l = new Handler(Looper.getMainLooper());
        C10049a c10049a = new C10049a();
        FullAdWidget fullAdWidget2 = this.f20216d;
        fullAdWidget2.setOnItemClickListener(c10049a);
        fullAdWidget2.setOnPreparedListener(this);
        fullAdWidget2.setOnErrorListener(this);
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10005c
    /* renamed from: a */
    public final void mo1311a(boolean z, boolean z2) {
        this.f20233j = z2;
        this.f20216d.setCtaEnabled(z && z2);
    }

    @Override // com.vungle.warren.p058ui.view.AbstractC10038a, com.vungle.warren.p058ui.contract.InterfaceC10002a
    public final void close() {
        super.close();
        this.f20235l.removeCallbacksAndMessages(null);
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10005c
    /* renamed from: f */
    public final int mo1310f() {
        return this.f20216d.getCurrentVideoPosition();
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10005c
    /* renamed from: i */
    public final boolean mo1309i() {
        return this.f20216d.f20190c.isPlaying();
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10005c
    /* renamed from: j */
    public final void mo1308j() {
        this.f20216d.f20190c.pause();
        RunnableC10051i runnableC10051i = this.f20234k;
        if (runnableC10051i != null) {
            this.f20235l.removeCallbacks(runnableC10051i);
        }
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10005c
    /* renamed from: m */
    public final void mo1307m(@NonNull File file, boolean z, int i) {
        boolean z2;
        String str;
        String str2;
        if (!this.f20231h && !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f20231h = z2;
        RunnableC10051i runnableC10051i = new RunnableC10051i(this);
        this.f20234k = runnableC10051i;
        this.f20235l.post(runnableC10051i);
        Uri fromFile = Uri.fromFile(file);
        FullAdWidget fullAdWidget = this.f20216d;
        fullAdWidget.f20191d.setVisibility(0);
        VideoView videoView = fullAdWidget.f20190c;
        videoView.setVideoURI(fromFile);
        Bitmap m1288b = ViewUtility.m1288b(ViewUtility.Asset.privacy, fullAdWidget.getContext());
        ImageView imageView = fullAdWidget.f20197j;
        imageView.setImageBitmap(m1288b);
        imageView.setVisibility(0);
        ProgressBar progressBar = fullAdWidget.f20193f;
        progressBar.setVisibility(0);
        progressBar.setMax(videoView.getDuration());
        if (!videoView.isPlaying()) {
            videoView.requestFocus();
            fullAdWidget.f20203p = i;
            if (Build.VERSION.SDK_INT < 26) {
                videoView.seekTo(i);
            }
            videoView.start();
        }
        videoView.isPlaying();
        fullAdWidget.setMuted(this.f20231h);
        boolean z3 = this.f20231h;
        if (z3) {
            C10012a c10012a = this.f20230g;
            c10012a.f20127k = z3;
            if (z3) {
                str = "mute";
                str2 = "true";
            } else {
                str = "unmute";
                str2 = "false";
            }
            c10012a.m1343t(str, str2);
        }
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10002a
    /* renamed from: o */
    public final void mo1300o(@NonNull String str) {
        FullAdWidget fullAdWidget = this.f20216d;
        fullAdWidget.f20190c.stopPlayback();
        fullAdWidget.m1316d(str);
        this.f20235l.removeCallbacks(this.f20234k);
        this.f20232i = null;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(30);
        if (i != 1) {
            if (i != 100) {
                str = "UNKNOWN";
            } else {
                str = "MEDIA_ERROR_SERVER_DIED";
            }
        } else {
            str = "MEDIA_ERROR_UNKNOWN";
        }
        sb.append(str);
        sb.append(':');
        if (i2 != -1010) {
            if (i2 != -1007) {
                if (i2 != -1004) {
                    if (i2 != -110) {
                        if (i2 != 200) {
                            str2 = "MEDIA_ERROR_SYSTEM";
                        } else {
                            str2 = "MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK";
                        }
                    } else {
                        str2 = "MEDIA_ERROR_TIMED_OUT";
                    }
                } else {
                    str2 = "MEDIA_ERROR_IO";
                }
            } else {
                str2 = "MEDIA_ERROR_MALFORMED";
            }
        } else {
            str2 = "MEDIA_ERROR_UNSUPPORTED";
        }
        sb.append(str2);
        C10012a c10012a = this.f20230g;
        String sb2 = sb.toString();
        Report report = c10012a.f20124h;
        synchronized (report) {
            report.f19797q.add(sb2);
        }
        c10012a.f20125i.m1375x(c10012a.f20124h, c10012a.f20142z, true);
        c10012a.m1346q(27);
        if (!c10012a.f20129m && (!TextUtils.isEmpty(c10012a.f20123g.f19752q))) {
            c10012a.m1344s();
        } else {
            c10012a.m1346q(10);
            c10012a.f20130n.close();
        }
        String concat = C10012a.class.getSimpleName().concat("#onMediaError");
        VungleLogger.m1603c(concat, "Media Error: " + sb2);
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        float f;
        this.f20232i = mediaPlayer;
        if (mediaPlayer != null) {
            try {
                if (this.f20231h) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                mediaPlayer.setVolume(f, f);
            } catch (IllegalStateException e) {
                Log.i(this.f20215c, "Exception On Mute/Unmute", e);
            }
        }
        this.f20216d.setOnCompletionListener(new C10050b());
        C10012a c10012a = this.f20230g;
        mo1310f();
        c10012a.getClass();
        c10012a.m1343t("videoLength", String.format(Locale.ENGLISH, "%d", Integer.valueOf(mediaPlayer.getDuration())));
        RunnableC10051i runnableC10051i = new RunnableC10051i(this);
        this.f20234k = runnableC10051i;
        this.f20235l.post(runnableC10051i);
    }

    @Override // com.vungle.warren.p058ui.contract.InterfaceC10002a
    public final void setPresenter(@NonNull C10012a c10012a) {
        this.f20230g = c10012a;
    }
}
