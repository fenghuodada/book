package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C6970g1;
import com.google.android.exoplayer2.audio.C6688d;
import com.google.android.exoplayer2.util.C7408g0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public final class AudioFocusManager {

    /* renamed from: a */
    public final AudioManager f10456a;

    /* renamed from: b */
    public final C6620a f10457b;
    @Nullable

    /* renamed from: c */
    public InterfaceC6621b f10458c;
    @Nullable

    /* renamed from: d */
    public C6688d f10459d;

    /* renamed from: e */
    public int f10460e;

    /* renamed from: f */
    public int f10461f;

    /* renamed from: g */
    public float f10462g = 1.0f;

    /* renamed from: h */
    public AudioFocusRequest f10463h;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface PlayerCommand {
    }

    /* renamed from: com.google.android.exoplayer2.AudioFocusManager$a */
    /* loaded from: classes.dex */
    public class C6620a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a */
        public final Handler f10464a;

        public C6620a(Handler handler) {
            this.f10464a = handler;
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(final int i) {
            this.f10464a.post(new Runnable() { // from class: com.google.android.exoplayer2.e
                @Override // java.lang.Runnable
                public final void run() {
                    int i2;
                    AudioFocusManager audioFocusManager = AudioFocusManager.this;
                    audioFocusManager.getClass();
                    boolean z = true;
                    int i3 = i;
                    if (i3 != -3 && i3 != -2) {
                        if (i3 != -1) {
                            if (i3 != 1) {
                                C6964f.m5792c(38, "Unknown focus change type: ", i3, "AudioFocusManager");
                                return;
                            }
                            audioFocusManager.m6220d(1);
                            audioFocusManager.m6222b(1);
                            return;
                        }
                        audioFocusManager.m6222b(-1);
                        audioFocusManager.m6223a();
                        return;
                    }
                    if (i3 != -2) {
                        C6688d c6688d = audioFocusManager.f10459d;
                        if (c6688d == null || c6688d.f10691a != 1) {
                            z = false;
                        }
                        if (!z) {
                            i2 = 3;
                            audioFocusManager.m6220d(i2);
                        }
                    }
                    audioFocusManager.m6222b(0);
                    i2 = 2;
                    audioFocusManager.m6220d(i2);
                }
            });
        }
    }

    /* renamed from: com.google.android.exoplayer2.AudioFocusManager$b */
    /* loaded from: classes.dex */
    public interface InterfaceC6621b {
    }

    public AudioFocusManager(Context context, Handler handler, C6970g1.SurfaceHolder$CallbackC6972b surfaceHolder$CallbackC6972b) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.f10456a = audioManager;
        this.f10458c = surfaceHolder$CallbackC6972b;
        this.f10457b = new C6620a(handler);
        this.f10460e = 0;
    }

    /* renamed from: a */
    public final void m6223a() {
        if (this.f10460e == 0) {
            return;
        }
        int i = C7408g0.f13905a;
        AudioManager audioManager = this.f10456a;
        if (i >= 26) {
            AudioFocusRequest audioFocusRequest = this.f10463h;
            if (audioFocusRequest != null) {
                audioManager.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            audioManager.abandonAudioFocus(this.f10457b);
        }
        m6220d(0);
    }

    /* renamed from: b */
    public final void m6222b(int i) {
        InterfaceC6621b interfaceC6621b = this.f10458c;
        if (interfaceC6621b != null) {
            C6970g1 c6970g1 = C6970g1.this;
            boolean mo5740g = c6970g1.mo5740g();
            int i2 = 1;
            if (mo5740g && i != 1) {
                i2 = 2;
            }
            c6970g1.m5741f0(i, i2, mo5740g);
        }
    }

    /* renamed from: c */
    public final void m6221c() {
        if (!C7408g0.m5105a(this.f10459d, null)) {
            this.f10459d = null;
            this.f10461f = 0;
        }
    }

    /* renamed from: d */
    public final void m6220d(int i) {
        float f;
        if (this.f10460e == i) {
            return;
        }
        this.f10460e = i;
        if (i == 3) {
            f = 0.2f;
        } else {
            f = 1.0f;
        }
        if (this.f10462g == f) {
            return;
        }
        this.f10462g = f;
        InterfaceC6621b interfaceC6621b = this.f10458c;
        if (interfaceC6621b != null) {
            C6970g1 c6970g1 = C6970g1.this;
            c6970g1.m5749b0(1, 2, Float.valueOf(c6970g1.f12070C * c6970g1.f12089n.f10462g));
        }
    }

    /* renamed from: e */
    public final int m6219e(int i, boolean z) {
        boolean z2;
        int requestAudioFocus;
        AudioFocusRequest.Builder builder;
        boolean z3;
        int i2 = 1;
        if (i != 1 && this.f10461f == 1) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            m6223a();
            if (z) {
                return 1;
            }
            return -1;
        } else if (!z) {
            return -1;
        } else {
            if (this.f10460e != 1) {
                int i3 = C7408g0.f13905a;
                C6620a c6620a = this.f10457b;
                AudioManager audioManager = this.f10456a;
                if (i3 >= 26) {
                    AudioFocusRequest audioFocusRequest = this.f10463h;
                    if (audioFocusRequest == null) {
                        if (audioFocusRequest == null) {
                            builder = new AudioFocusRequest.Builder(this.f10461f);
                        } else {
                            builder = new AudioFocusRequest.Builder(this.f10463h);
                        }
                        C6688d c6688d = this.f10459d;
                        if (c6688d != null && c6688d.f10691a == 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        c6688d.getClass();
                        this.f10463h = builder.setAudioAttributes(c6688d.m6071a()).setWillPauseWhenDucked(z3).setOnAudioFocusChangeListener(c6620a).build();
                    }
                    requestAudioFocus = audioManager.requestAudioFocus(this.f10463h);
                } else {
                    C6688d c6688d2 = this.f10459d;
                    c6688d2.getClass();
                    requestAudioFocus = audioManager.requestAudioFocus(c6620a, C7408g0.m5090p(c6688d2.f10693c), this.f10461f);
                }
                if (requestAudioFocus == 1) {
                    m6220d(1);
                } else {
                    m6220d(0);
                    i2 = -1;
                }
            }
            return i2;
        }
    }
}
