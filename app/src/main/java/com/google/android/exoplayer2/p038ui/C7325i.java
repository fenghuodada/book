package com.google.android.exoplayer2.p038ui;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.AbstractC6984j1;
import com.google.android.exoplayer2.C6622C;
import com.google.android.exoplayer2.C6633a1;
import com.google.android.exoplayer2.C6982j;
import com.google.android.exoplayer2.C6999l0;
import com.google.android.exoplayer2.C7127q0;
import com.google.android.exoplayer2.InterfaceC6979i;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.metadata.C7042a;
import com.google.android.exoplayer2.p038ui.InterfaceC7338o;
import com.google.android.exoplayer2.source.C7178k0;
import com.google.android.exoplayer2.trackselection.C7303k;
import com.google.android.exoplayer2.util.C7394a;
import com.google.android.exoplayer2.util.C7408g0;
import com.google.android.exoplayer2.util.C7409h;
import com.google.android.exoplayer2.video.C7496w;
import java.util.Formatter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.exoplayer2.ui.i */
/* loaded from: classes.dex */
public final class C7325i extends FrameLayout {

    /* renamed from: A */
    public final Drawable f13604A;

    /* renamed from: B */
    public final Drawable f13605B;

    /* renamed from: C */
    public final float f13606C;

    /* renamed from: D */
    public final float f13607D;

    /* renamed from: E */
    public final String f13608E;

    /* renamed from: F */
    public final String f13609F;
    @Nullable

    /* renamed from: G */
    public Player f13610G;

    /* renamed from: H */
    public InterfaceC6979i f13611H;

    /* renamed from: I */
    public boolean f13612I;

    /* renamed from: J */
    public boolean f13613J;

    /* renamed from: K */
    public boolean f13614K;

    /* renamed from: L */
    public boolean f13615L;

    /* renamed from: M */
    public int f13616M;

    /* renamed from: N */
    public int f13617N;

    /* renamed from: O */
    public int f13618O;

    /* renamed from: P */
    public boolean f13619P;

    /* renamed from: Q */
    public boolean f13620Q;

    /* renamed from: R */
    public boolean f13621R;

    /* renamed from: S */
    public boolean f13622S;

    /* renamed from: T */
    public boolean f13623T;

    /* renamed from: U */
    public long f13624U;

    /* renamed from: V */
    public long[] f13625V;

    /* renamed from: W */
    public boolean[] f13626W;

    /* renamed from: a */
    public final View$OnClickListenerC7327b f13627a;

    /* renamed from: b */
    public final CopyOnWriteArrayList<InterfaceC7329d> f13628b;
    @Nullable

    /* renamed from: c */
    public final View f13629c;
    @Nullable

    /* renamed from: d */
    public final View f13630d;

    /* renamed from: d0 */
    public final long[] f13631d0;
    @Nullable

    /* renamed from: e */
    public final View f13632e;

    /* renamed from: e0 */
    public final boolean[] f13633e0;
    @Nullable

    /* renamed from: f */
    public final View f13634f;

    /* renamed from: f0 */
    public long f13635f0;
    @Nullable

    /* renamed from: g */
    public final View f13636g;

    /* renamed from: g0 */
    public long f13637g0;
    @Nullable

    /* renamed from: h */
    public final View f13638h;
    @Nullable

    /* renamed from: i */
    public final ImageView f13639i;
    @Nullable

    /* renamed from: j */
    public final ImageView f13640j;
    @Nullable

    /* renamed from: k */
    public final View f13641k;
    @Nullable

    /* renamed from: l */
    public final TextView f13642l;
    @Nullable

    /* renamed from: m */
    public final TextView f13643m;
    @Nullable

    /* renamed from: n */
    public final InterfaceC7338o f13644n;

    /* renamed from: o */
    public final StringBuilder f13645o;

    /* renamed from: p */
    public final Formatter f13646p;

    /* renamed from: q */
    public final AbstractC6984j1.C6986b f13647q;

    /* renamed from: r */
    public final AbstractC6984j1.C6987c f13648r;

    /* renamed from: s */
    public final RunnableC7323g f13649s;

    /* renamed from: t */
    public final RunnableC7324h f13650t;

    /* renamed from: u */
    public final Drawable f13651u;

    /* renamed from: v */
    public final Drawable f13652v;

    /* renamed from: w */
    public final Drawable f13653w;

    /* renamed from: x */
    public final String f13654x;

    /* renamed from: y */
    public final String f13655y;

    /* renamed from: z */
    public final String f13656z;

    @RequiresApi(21)
    /* renamed from: com.google.android.exoplayer2.ui.i$a */
    /* loaded from: classes.dex */
    public static final class C7326a {
        @DoNotInline
        /* renamed from: a */
        public static boolean m5197a(View view) {
            return view.isAccessibilityFocused();
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.i$b */
    /* loaded from: classes.dex */
    public final class View$OnClickListenerC7327b implements Player.InterfaceC6628d, InterfaceC7338o.InterfaceC7339a, View.OnClickListener {
        public View$OnClickListenerC7327b() {
        }

        @Override // com.google.android.exoplayer2.device.InterfaceC6753a
        /* renamed from: A */
        public final /* synthetic */ void mo5196A() {
        }

        @Override // com.google.android.exoplayer2.video.InterfaceC7465l
        /* renamed from: K */
        public final /* synthetic */ void mo4926K(int i, int i2) {
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC6696g, com.google.android.exoplayer2.audio.InterfaceC6718s
        /* renamed from: a */
        public final /* synthetic */ void mo5195a(boolean z) {
        }

        @Override // com.google.android.exoplayer2.video.InterfaceC7465l
        /* renamed from: b */
        public final /* synthetic */ void mo4925b() {
        }

        @Override // com.google.android.exoplayer2.video.InterfaceC7465l, com.google.android.exoplayer2.video.InterfaceC7494v
        /* renamed from: c */
        public final /* synthetic */ void mo4898c(C7496w c7496w) {
        }

        @Override // com.google.android.exoplayer2.p038ui.InterfaceC7338o.InterfaceC7339a
        /* renamed from: d */
        public final void mo5184d(long j) {
            C7325i c7325i = C7325i.this;
            TextView textView = c7325i.f13643m;
            if (textView != null) {
                textView.setText(C7408g0.m5089q(c7325i.f13645o, c7325i.f13646p, j));
            }
        }

        @Override // com.google.android.exoplayer2.p038ui.InterfaceC7338o.InterfaceC7339a
        /* renamed from: e */
        public final void mo5183e(long j) {
            C7325i c7325i = C7325i.this;
            c7325i.f13615L = true;
            TextView textView = c7325i.f13643m;
            if (textView != null) {
                textView.setText(C7408g0.m5089q(c7325i.f13645o, c7325i.f13646p, j));
            }
        }

        @Override // com.google.android.exoplayer2.video.InterfaceC7465l
        /* renamed from: f */
        public final /* synthetic */ void mo4924f() {
        }

        @Override // com.google.android.exoplayer2.p038ui.InterfaceC7338o.InterfaceC7339a
        /* renamed from: g */
        public final void mo5182g(long j, boolean z) {
            Player player;
            C7325i c7325i = C7325i.this;
            int i = 0;
            c7325i.f13615L = false;
            if (!z && (player = c7325i.f13610G) != null) {
                AbstractC6984j1 mo5762G = player.mo5762G();
                if (c7325i.f13614K && !mo5762G.m5685p()) {
                    int mo5409o = mo5762G.mo5409o();
                    while (true) {
                        long m6216c = C6622C.m6216c(mo5762G.m5686m(i, c7325i.f13648r).f12174n);
                        if (j < m6216c) {
                            break;
                        } else if (i == mo5409o - 1) {
                            j = m6216c;
                            break;
                        } else {
                            j -= m6216c;
                            i++;
                        }
                    }
                } else {
                    i = player.mo5730p();
                }
                ((C6982j) c7325i.f13611H).getClass();
                player.mo5742f(i, j);
                c7325i.m5201j();
            }
        }

        @Override // com.google.android.exoplayer2.audio.InterfaceC6696g
        /* renamed from: o */
        public final /* synthetic */ void mo5194o(float f) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onAvailableCommandsChanged(Player.C6624a c6624a) {
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x0094 A[LOOP:0: B:28:0x0075->B:45:0x0094, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0092 A[SYNTHETIC] */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onClick(android.view.View r9) {
            /*
                r8 = this;
                com.google.android.exoplayer2.ui.i r0 = com.google.android.exoplayer2.p038ui.C7325i.this
                com.google.android.exoplayer2.Player r1 = r0.f13610G
                if (r1 != 0) goto L7
                return
            L7:
                android.view.View r2 = r0.f13630d
                if (r2 != r9) goto L17
                com.google.android.exoplayer2.i r9 = r0.f13611H
                com.google.android.exoplayer2.j r9 = (com.google.android.exoplayer2.C6982j) r9
                r9.getClass()
                r1.mo5790K()
                goto Lb3
            L17:
                android.view.View r2 = r0.f13629c
                if (r2 != r9) goto L27
                com.google.android.exoplayer2.i r9 = r0.f13611H
                com.google.android.exoplayer2.j r9 = (com.google.android.exoplayer2.C6982j) r9
                r9.getClass()
                r1.mo5780q()
                goto Lb3
            L27:
                android.view.View r2 = r0.f13636g
                if (r2 != r9) goto L3e
                int r9 = r1.mo5725v()
                r2 = 4
                if (r9 == r2) goto Lb3
                com.google.android.exoplayer2.i r9 = r0.f13611H
                com.google.android.exoplayer2.j r9 = (com.google.android.exoplayer2.C6982j) r9
                r9.getClass()
                r1.mo5789L()
                goto Lb3
            L3e:
                android.view.View r2 = r0.f13638h
                if (r2 != r9) goto L4e
                com.google.android.exoplayer2.i r9 = r0.f13611H
                com.google.android.exoplayer2.j r9 = (com.google.android.exoplayer2.C6982j) r9
                r9.getClass()
                r1.mo5788O()
                goto Lb3
            L4e:
                android.view.View r2 = r0.f13632e
                if (r2 != r9) goto L57
                r0.m5209b(r1)
                goto Lb3
            L57:
                android.view.View r2 = r0.f13634f
                r3 = 0
                if (r2 != r9) goto L67
                com.google.android.exoplayer2.i r9 = r0.f13611H
                com.google.android.exoplayer2.j r9 = (com.google.android.exoplayer2.C6982j) r9
                r9.getClass()
                r1.mo5729r(r3)
                goto Lb3
            L67:
                android.widget.ImageView r2 = r0.f13639i
                r4 = 1
                if (r2 != r9) goto La0
                com.google.android.exoplayer2.i r9 = r0.f13611H
                int r2 = r1.mo5763F()
                int r0 = r0.f13618O
                r5 = r4
            L75:
                r6 = 2
                if (r5 > r6) goto L97
                int r7 = r2 + r5
                int r7 = r7 % 3
                if (r7 == 0) goto L8f
                if (r7 == r4) goto L88
                if (r7 == r6) goto L83
                goto L8d
            L83:
                r6 = r0 & 2
                if (r6 == 0) goto L8d
                goto L8f
            L88:
                r6 = r0 & 1
                if (r6 == 0) goto L8d
                goto L8f
            L8d:
                r6 = r3
                goto L90
            L8f:
                r6 = r4
            L90:
                if (r6 == 0) goto L94
                r2 = r7
                goto L97
            L94:
                int r5 = r5 + 1
                goto L75
            L97:
                com.google.android.exoplayer2.j r9 = (com.google.android.exoplayer2.C6982j) r9
                r9.getClass()
                r1.mo5767B(r2)
                goto Lb3
            La0:
                android.widget.ImageView r2 = r0.f13640j
                if (r2 != r9) goto Lb3
                com.google.android.exoplayer2.i r9 = r0.f13611H
                boolean r0 = r1.mo5760I()
                r0 = r0 ^ r4
                com.google.android.exoplayer2.j r9 = (com.google.android.exoplayer2.C6982j) r9
                r9.getClass()
                r1.mo5738h(r0)
            Lb3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p038ui.C7325i.View$OnClickListenerC7327b.onClick(android.view.View):void");
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final void onEvents(Player player, Player.C6627c c6627c) {
            boolean m6211a = c6627c.m6211a(5, 6);
            C7325i c7325i = C7325i.this;
            if (m6211a) {
                c7325i.m5202i();
            }
            if (c6627c.m6211a(5, 6, 8)) {
                c7325i.m5201j();
            }
            C7409h c7409h = c6627c.f10542a;
            if (c7409h.f13916a.get(9)) {
                c7325i.m5200k();
            }
            if (c7409h.f13916a.get(10)) {
                c7325i.m5199l();
            }
            if (c6627c.m6211a(9, 10, 12, 0, 14)) {
                c7325i.m5203h();
            }
            if (c6627c.m6211a(12, 0)) {
                c7325i.m5198m();
            }
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onIsLoadingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onIsPlayingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onLoadingChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onMediaItemTransition(C7127q0 c7127q0, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onPlaybackParametersChanged(C6633a1 c6633a1) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onPlaybackStateChanged(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onPlayerError(PlaybackException playbackException) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onPositionDiscontinuity(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onPositionDiscontinuity(Player.C6629e c6629e, Player.C6629e c6629e2, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onRepeatModeChanged(int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onSeekProcessed() {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onStaticMetadataChanged(List list) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onTimelineChanged(AbstractC6984j1 abstractC6984j1, int i) {
        }

        @Override // com.google.android.exoplayer2.Player.InterfaceC6626b
        public final /* synthetic */ void onTracksChanged(C7178k0 c7178k0, C7303k c7303k) {
        }

        @Override // com.google.android.exoplayer2.metadata.InterfaceC7052e
        /* renamed from: r */
        public final /* synthetic */ void mo5193r(C7042a c7042a) {
        }

        @Override // com.google.android.exoplayer2.device.InterfaceC6753a
        /* renamed from: v */
        public final /* synthetic */ void mo5192v() {
        }

        @Override // com.google.android.exoplayer2.text.InterfaceC7239i
        /* renamed from: z */
        public final /* synthetic */ void mo5191z(List list) {
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.i$c */
    /* loaded from: classes.dex */
    public interface InterfaceC7328c {
    }

    /* renamed from: com.google.android.exoplayer2.ui.i$d */
    /* loaded from: classes.dex */
    public interface InterfaceC7329d {
        void onVisibilityChange(int i);
    }

    static {
        HashSet<String> hashSet = C6999l0.f12262a;
        synchronized (C6999l0.class) {
            if (C6999l0.f12262a.add("goog.exo.ui")) {
                String str = C6999l0.f12263b;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + "goog.exo.ui".length());
                sb.append(str);
                sb.append(", goog.exo.ui");
                C6999l0.f12263b = sb.toString();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014a  */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.google.android.exoplayer2.ui.g] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.exoplayer2.ui.h] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7325i(android.content.Context r7) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p038ui.C7325i.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public final boolean m5210a(KeyEvent keyEvent) {
        boolean z;
        int keyCode = keyEvent.getKeyCode();
        Player player = this.f13610G;
        if (player != null) {
            if (keyCode != 90 && keyCode != 89 && keyCode != 85 && keyCode != 79 && keyCode != 126 && keyCode != 127 && keyCode != 87 && keyCode != 88) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (keyEvent.getAction() == 0) {
                    if (keyCode == 90) {
                        if (player.mo5725v() != 4) {
                            ((C6982j) this.f13611H).getClass();
                            player.mo5789L();
                        }
                    } else if (keyCode == 89) {
                        ((C6982j) this.f13611H).getClass();
                        player.mo5788O();
                    } else if (keyEvent.getRepeatCount() == 0) {
                        if (keyCode != 79 && keyCode != 85) {
                            if (keyCode != 87) {
                                if (keyCode != 88) {
                                    if (keyCode != 126) {
                                        if (keyCode == 127) {
                                            ((C6982j) this.f13611H).getClass();
                                            player.mo5729r(false);
                                        }
                                    } else {
                                        m5209b(player);
                                    }
                                } else {
                                    ((C6982j) this.f13611H).getClass();
                                    player.mo5780q();
                                }
                            } else {
                                ((C6982j) this.f13611H).getClass();
                                player.mo5790K();
                            }
                        } else {
                            int mo5725v = player.mo5725v();
                            if (mo5725v != 1 && mo5725v != 4 && player.mo5740g()) {
                                ((C6982j) this.f13611H).getClass();
                                player.mo5729r(false);
                            } else {
                                m5209b(player);
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void m5209b(Player player) {
        int mo5725v = player.mo5725v();
        if (mo5725v == 1) {
            ((C6982j) this.f13611H).getClass();
            player.prepare();
        } else if (mo5725v == 4) {
            int mo5730p = player.mo5730p();
            ((C6982j) this.f13611H).getClass();
            player.mo5742f(mo5730p, -9223372036854775807L);
        }
        ((C6982j) this.f13611H).getClass();
        player.mo5729r(true);
    }

    /* renamed from: c */
    public final void m5208c() {
        if (m5206e()) {
            setVisibility(8);
            Iterator<InterfaceC7329d> it = this.f13628b.iterator();
            while (it.hasNext()) {
                it.next().onVisibilityChange(getVisibility());
            }
            removeCallbacks(this.f13649s);
            removeCallbacks(this.f13650t);
            this.f13624U = -9223372036854775807L;
        }
    }

    /* renamed from: d */
    public final void m5207d() {
        RunnableC7324h runnableC7324h = this.f13650t;
        removeCallbacks(runnableC7324h);
        if (this.f13616M <= 0) {
            this.f13624U = -9223372036854775807L;
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.f13616M;
        this.f13624U = uptimeMillis + j;
        if (this.f13612I) {
            postDelayed(runnableC7324h, j);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m5210a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f13650t);
        } else if (motionEvent.getAction() == 1) {
            m5207d();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: e */
    public final boolean m5206e() {
        return getVisibility() == 0;
    }

    /* renamed from: f */
    public final boolean m5205f() {
        Player player = this.f13610G;
        return (player == null || player.mo5725v() == 4 || this.f13610G.mo5725v() == 1 || !this.f13610G.mo5740g()) ? false : true;
    }

    /* renamed from: g */
    public final void m5204g(@Nullable View view, boolean z, boolean z2) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.f13606C : this.f13607D);
        view.setVisibility(z ? 0 : 8);
    }

    @Nullable
    public Player getPlayer() {
        return this.f13610G;
    }

    public int getRepeatToggleModes() {
        return this.f13618O;
    }

    public boolean getShowShuffleButton() {
        return this.f13623T;
    }

    public int getShowTimeoutMs() {
        return this.f13616M;
    }

    public boolean getShowVrButton() {
        View view = this.f13641k;
        return view != null && view.getVisibility() == 0;
    }

    /* renamed from: h */
    public final void m5203h() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (m5206e() && this.f13612I) {
            Player player = this.f13610G;
            boolean z5 = false;
            if (player != null) {
                boolean mo5791A = player.mo5791A(4);
                boolean mo5791A2 = player.mo5791A(6);
                if (player.mo5791A(10)) {
                    this.f13611H.getClass();
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (player.mo5791A(11)) {
                    this.f13611H.getClass();
                    z5 = true;
                }
                z2 = player.mo5791A(8);
                z = z5;
                z5 = mo5791A2;
                z3 = mo5791A;
            } else {
                z = false;
                z2 = false;
                z3 = false;
                z4 = false;
            }
            m5204g(this.f13629c, this.f13621R, z5);
            m5204g(this.f13638h, this.f13619P, z4);
            m5204g(this.f13636g, this.f13620Q, z);
            m5204g(this.f13630d, this.f13622S, z2);
            InterfaceC7338o interfaceC7338o = this.f13644n;
            if (interfaceC7338o != null) {
                interfaceC7338o.setEnabled(z3);
            }
        }
    }

    /* renamed from: i */
    public final void m5202i() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        if (m5206e() && this.f13612I) {
            boolean m5205f = m5205f();
            View view = this.f13632e;
            boolean z6 = true;
            int i2 = 0;
            if (view != null) {
                if (m5205f && view.isFocused()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z = z4 | false;
                if (C7408g0.f13905a < 21) {
                    z5 = z;
                } else if (m5205f && C7326a.m5197a(view)) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                z2 = z5 | false;
                if (m5205f) {
                    i = 8;
                } else {
                    i = 0;
                }
                view.setVisibility(i);
            } else {
                z = false;
                z2 = false;
            }
            View view2 = this.f13634f;
            if (view2 != null) {
                if (!m5205f && view2.isFocused()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z |= z3;
                if (C7408g0.f13905a < 21) {
                    z6 = z;
                } else if (m5205f || !C7326a.m5197a(view2)) {
                    z6 = false;
                }
                z2 |= z6;
                if (!m5205f) {
                    i2 = 8;
                }
                view2.setVisibility(i2);
            }
            if (z) {
                boolean m5205f2 = m5205f();
                if (!m5205f2 && view != null) {
                    view.requestFocus();
                } else if (m5205f2 && view2 != null) {
                    view2.requestFocus();
                }
            }
            if (z2) {
                boolean m5205f3 = m5205f();
                if (!m5205f3 && view != null) {
                    view.sendAccessibilityEvent(8);
                } else if (m5205f3 && view2 != null) {
                    view2.sendAccessibilityEvent(8);
                }
            }
        }
    }

    /* renamed from: j */
    public final void m5201j() {
        long j;
        long j2;
        float f;
        if (m5206e() && this.f13612I) {
            Player player = this.f13610G;
            if (player != null) {
                j = player.mo5727t() + this.f13635f0;
                j2 = player.mo5759J() + this.f13635f0;
            } else {
                j = 0;
                j2 = 0;
            }
            boolean z = j != this.f13637g0;
            this.f13637g0 = j;
            TextView textView = this.f13643m;
            if (textView != null && !this.f13615L && z) {
                textView.setText(C7408g0.m5089q(this.f13645o, this.f13646p, j));
            }
            InterfaceC7338o interfaceC7338o = this.f13644n;
            if (interfaceC7338o != null) {
                interfaceC7338o.setPosition(j);
                interfaceC7338o.setBufferedPosition(j2);
            }
            RunnableC7323g runnableC7323g = this.f13649s;
            removeCallbacks(runnableC7323g);
            int mo5725v = player == null ? 1 : player.mo5725v();
            if (player != null && player.isPlaying()) {
                long min = Math.min(interfaceC7338o != null ? interfaceC7338o.getPreferredUpdateDelay() : 1000L, 1000 - (j % 1000));
                postDelayed(runnableC7323g, C7408g0.m5098h(player.mo5748c().f10557a > 0.0f ? ((float) min) / f : 1000L, this.f13617N, 1000L));
            } else if (mo5725v == 4 || mo5725v == 1) {
            } else {
                postDelayed(runnableC7323g, 1000L);
            }
        }
    }

    /* renamed from: k */
    public final void m5200k() {
        ImageView imageView;
        String str;
        if (m5206e() && this.f13612I && (imageView = this.f13639i) != null) {
            if (this.f13618O == 0) {
                m5204g(imageView, false, false);
                return;
            }
            Player player = this.f13610G;
            String str2 = this.f13654x;
            Drawable drawable = this.f13651u;
            if (player == null) {
                m5204g(imageView, true, false);
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str2);
                return;
            }
            m5204g(imageView, true, true);
            int mo5763F = player.mo5763F();
            if (mo5763F != 0) {
                if (mo5763F == 1) {
                    imageView.setImageDrawable(this.f13652v);
                    str = this.f13655y;
                } else if (mo5763F == 2) {
                    imageView.setImageDrawable(this.f13653w);
                    str = this.f13656z;
                }
                imageView.setContentDescription(str);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str2);
            }
            imageView.setVisibility(0);
        }
    }

    /* renamed from: l */
    public final void m5199l() {
        ImageView imageView;
        if (m5206e() && this.f13612I && (imageView = this.f13640j) != null) {
            Player player = this.f13610G;
            if (!this.f13623T) {
                m5204g(imageView, false, false);
                return;
            }
            String str = this.f13609F;
            Drawable drawable = this.f13605B;
            if (player == null) {
                m5204g(imageView, true, false);
                imageView.setImageDrawable(drawable);
            } else {
                m5204g(imageView, true, true);
                if (player.mo5760I()) {
                    drawable = this.f13604A;
                }
                imageView.setImageDrawable(drawable);
                if (player.mo5760I()) {
                    str = this.f13608E;
                }
            }
            imageView.setContentDescription(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016b  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5198m() {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p038ui.C7325i.m5198m():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f13612I = true;
        long j = this.f13624U;
        if (j != -9223372036854775807L) {
            long uptimeMillis = j - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                m5208c();
            } else {
                postDelayed(this.f13650t, uptimeMillis);
            }
        } else if (m5206e()) {
            m5207d();
        }
        m5202i();
        m5203h();
        m5200k();
        m5199l();
        m5198m();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f13612I = false;
        removeCallbacks(this.f13649s);
        removeCallbacks(this.f13650t);
    }

    @Deprecated
    public void setControlDispatcher(InterfaceC6979i interfaceC6979i) {
        if (this.f13611H != interfaceC6979i) {
            this.f13611H = interfaceC6979i;
            m5203h();
        }
    }

    public void setPlayer(@Nullable Player player) {
        boolean z;
        boolean z2 = true;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        C7394a.m5131d(z);
        if (player != null && player.mo5761H() != Looper.getMainLooper()) {
            z2 = false;
        }
        C7394a.m5134a(z2);
        Player player2 = this.f13610G;
        if (player2 == player) {
            return;
        }
        View$OnClickListenerC7327b view$OnClickListenerC7327b = this.f13627a;
        if (player2 != null) {
            player2.mo5733m(view$OnClickListenerC7327b);
        }
        this.f13610G = player;
        if (player != null) {
            player.mo5726u(view$OnClickListenerC7327b);
        }
        m5202i();
        m5203h();
        m5200k();
        m5199l();
        m5198m();
    }

    public void setProgressUpdateListener(@Nullable InterfaceC7328c interfaceC7328c) {
    }

    public void setRepeatToggleModes(int i) {
        this.f13618O = i;
        Player player = this.f13610G;
        if (player != null) {
            int mo5763F = player.mo5763F();
            if (i == 0 && mo5763F != 0) {
                InterfaceC6979i interfaceC6979i = this.f13611H;
                Player player2 = this.f13610G;
                ((C6982j) interfaceC6979i).getClass();
                player2.mo5767B(0);
            } else if (i == 1 && mo5763F == 2) {
                InterfaceC6979i interfaceC6979i2 = this.f13611H;
                Player player3 = this.f13610G;
                ((C6982j) interfaceC6979i2).getClass();
                player3.mo5767B(1);
            } else if (i == 2 && mo5763F == 1) {
                InterfaceC6979i interfaceC6979i3 = this.f13611H;
                Player player4 = this.f13610G;
                ((C6982j) interfaceC6979i3).getClass();
                player4.mo5767B(2);
            }
        }
        m5200k();
    }

    public void setShowFastForwardButton(boolean z) {
        this.f13620Q = z;
        m5203h();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.f13613J = z;
        m5198m();
    }

    public void setShowNextButton(boolean z) {
        this.f13622S = z;
        m5203h();
    }

    public void setShowPreviousButton(boolean z) {
        this.f13621R = z;
        m5203h();
    }

    public void setShowRewindButton(boolean z) {
        this.f13619P = z;
        m5203h();
    }

    public void setShowShuffleButton(boolean z) {
        this.f13623T = z;
        m5199l();
    }

    public void setShowTimeoutMs(int i) {
        this.f13616M = i;
        if (m5206e()) {
            m5207d();
        }
    }

    public void setShowVrButton(boolean z) {
        View view = this.f13641k;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.f13617N = C7408g0.m5099g(i, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        View view = this.f13641k;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            m5204g(view, getShowVrButton(), onClickListener != null);
        }
    }
}
