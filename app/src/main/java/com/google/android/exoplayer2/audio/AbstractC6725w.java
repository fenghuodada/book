package com.google.android.exoplayer2.audio;

import androidx.annotation.CallSuper;
import com.google.android.exoplayer2.audio.InterfaceC6699h;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.google.android.exoplayer2.audio.w */
/* loaded from: classes.dex */
public abstract class AbstractC6725w implements InterfaceC6699h {

    /* renamed from: b */
    public InterfaceC6699h.C6700a f10865b;

    /* renamed from: c */
    public InterfaceC6699h.C6700a f10866c;

    /* renamed from: d */
    public InterfaceC6699h.C6700a f10867d;

    /* renamed from: e */
    public InterfaceC6699h.C6700a f10868e;

    /* renamed from: f */
    public ByteBuffer f10869f;

    /* renamed from: g */
    public ByteBuffer f10870g;

    /* renamed from: h */
    public boolean f10871h;

    public AbstractC6725w() {
        ByteBuffer byteBuffer = InterfaceC6699h.f10731a;
        this.f10869f = byteBuffer;
        this.f10870g = byteBuffer;
        InterfaceC6699h.C6700a c6700a = InterfaceC6699h.C6700a.f10732e;
        this.f10867d = c6700a;
        this.f10868e = c6700a;
        this.f10865b = c6700a;
        this.f10866c = c6700a;
    }

    /* renamed from: a */
    public abstract InterfaceC6699h.C6700a mo6033a(InterfaceC6699h.C6700a c6700a) throws InterfaceC6699h.C6701b;

    @Override // com.google.android.exoplayer2.audio.InterfaceC6699h
    @CallSuper
    /* renamed from: b */
    public boolean mo6040b() {
        return this.f10871h && this.f10870g == InterfaceC6699h.f10731a;
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC6699h
    /* renamed from: c */
    public boolean mo6039c() {
        return this.f10868e != InterfaceC6699h.C6700a.f10732e;
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC6699h
    @CallSuper
    /* renamed from: d */
    public ByteBuffer mo6038d() {
        ByteBuffer byteBuffer = this.f10870g;
        this.f10870g = InterfaceC6699h.f10731a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC6699h
    /* renamed from: f */
    public final InterfaceC6699h.C6700a mo6037f(InterfaceC6699h.C6700a c6700a) throws InterfaceC6699h.C6701b {
        this.f10867d = c6700a;
        this.f10868e = mo6033a(c6700a);
        return mo6039c() ? this.f10868e : InterfaceC6699h.C6700a.f10732e;
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC6699h
    public final void flush() {
        this.f10870g = InterfaceC6699h.f10731a;
        this.f10871h = false;
        this.f10865b = this.f10867d;
        this.f10866c = this.f10868e;
        mo6031h();
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC6699h
    /* renamed from: g */
    public final void mo6036g() {
        this.f10871h = true;
        mo6035i();
    }

    /* renamed from: h */
    public void mo6031h() {
    }

    /* renamed from: i */
    public void mo6035i() {
    }

    /* renamed from: j */
    public void mo6030j() {
    }

    /* renamed from: k */
    public final ByteBuffer m6034k(int i) {
        if (this.f10869f.capacity() < i) {
            this.f10869f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f10869f.clear();
        }
        ByteBuffer byteBuffer = this.f10869f;
        this.f10870g = byteBuffer;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.InterfaceC6699h
    public final void reset() {
        flush();
        this.f10869f = InterfaceC6699h.f10731a;
        InterfaceC6699h.C6700a c6700a = InterfaceC6699h.C6700a.f10732e;
        this.f10867d = c6700a;
        this.f10868e = c6700a;
        this.f10865b = c6700a;
        this.f10866c = c6700a;
        mo6030j();
    }
}
