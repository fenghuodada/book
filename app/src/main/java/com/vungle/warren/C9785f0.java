package com.vungle.warren;

import com.vungle.warren.error.VungleException;
import com.vungle.warren.utility.C10106u;
import java.util.concurrent.ExecutorService;

/* renamed from: com.vungle.warren.f0 */
/* loaded from: classes3.dex */
public final class C9785f0 implements InterfaceC9782e0 {

    /* renamed from: a */
    public final InterfaceC9782e0 f19510a;

    /* renamed from: b */
    public final ExecutorService f19511b;

    /* renamed from: com.vungle.warren.f0$a */
    /* loaded from: classes3.dex */
    public class RunnableC9786a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f19512a;

        public RunnableC9786a(String str) {
            this.f19512a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C9785f0.this.f19510a.creativeId(this.f19512a);
        }
    }

    /* renamed from: com.vungle.warren.f0$b */
    /* loaded from: classes3.dex */
    public class RunnableC9787b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f19514a;

        public RunnableC9787b(String str) {
            this.f19514a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C9785f0.this.f19510a.onAdStart(this.f19514a);
        }
    }

    /* renamed from: com.vungle.warren.f0$c */
    /* loaded from: classes3.dex */
    public class RunnableC9788c implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f19516a;

        /* renamed from: b */
        public final /* synthetic */ boolean f19517b;

        /* renamed from: c */
        public final /* synthetic */ boolean f19518c;

        public RunnableC9788c(String str, boolean z, boolean z2) {
            this.f19516a = str;
            this.f19517b = z;
            this.f19518c = z2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C9785f0.this.f19510a.onAdEnd(this.f19516a, this.f19517b, this.f19518c);
        }
    }

    /* renamed from: com.vungle.warren.f0$d */
    /* loaded from: classes3.dex */
    public class RunnableC9789d implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f19520a;

        public RunnableC9789d(String str) {
            this.f19520a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C9785f0.this.f19510a.onAdEnd(this.f19520a);
        }
    }

    /* renamed from: com.vungle.warren.f0$e */
    /* loaded from: classes3.dex */
    public class RunnableC9790e implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f19522a;

        public RunnableC9790e(String str) {
            this.f19522a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C9785f0.this.f19510a.onAdClick(this.f19522a);
        }
    }

    /* renamed from: com.vungle.warren.f0$f */
    /* loaded from: classes3.dex */
    public class RunnableC9791f implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f19524a;

        public RunnableC9791f(String str) {
            this.f19524a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C9785f0.this.f19510a.onAdLeftApplication(this.f19524a);
        }
    }

    /* renamed from: com.vungle.warren.f0$g */
    /* loaded from: classes3.dex */
    public class RunnableC9792g implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f19526a;

        public RunnableC9792g(String str) {
            this.f19526a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C9785f0.this.f19510a.onAdRewarded(this.f19526a);
        }
    }

    /* renamed from: com.vungle.warren.f0$h */
    /* loaded from: classes3.dex */
    public class RunnableC9793h implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f19528a;

        /* renamed from: b */
        public final /* synthetic */ VungleException f19529b;

        public RunnableC9793h(String str, VungleException vungleException) {
            this.f19528a = str;
            this.f19529b = vungleException;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C9785f0.this.f19510a.onError(this.f19528a, this.f19529b);
        }
    }

    /* renamed from: com.vungle.warren.f0$i */
    /* loaded from: classes3.dex */
    public class RunnableC9794i implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f19531a;

        public RunnableC9794i(String str) {
            this.f19531a = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C9785f0.this.f19510a.onAdViewed(this.f19531a);
        }
    }

    public C9785f0(ExecutorService executorService, InterfaceC9782e0 interfaceC9782e0) {
        this.f19510a = interfaceC9782e0;
        this.f19511b = executorService;
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public final void creativeId(String str) {
        InterfaceC9782e0 interfaceC9782e0 = this.f19510a;
        if (interfaceC9782e0 == null) {
            return;
        }
        if (C10106u.m1239a()) {
            interfaceC9782e0.creativeId(str);
            return;
        }
        this.f19511b.execute(new RunnableC9786a(str));
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public final void onAdClick(String str) {
        InterfaceC9782e0 interfaceC9782e0 = this.f19510a;
        if (interfaceC9782e0 == null) {
            return;
        }
        if (C10106u.m1239a()) {
            interfaceC9782e0.onAdClick(str);
            return;
        }
        this.f19511b.execute(new RunnableC9790e(str));
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public final void onAdEnd(String str) {
        InterfaceC9782e0 interfaceC9782e0 = this.f19510a;
        if (interfaceC9782e0 == null) {
            return;
        }
        if (C10106u.m1239a()) {
            interfaceC9782e0.onAdEnd(str);
            return;
        }
        this.f19511b.execute(new RunnableC9789d(str));
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public final void onAdEnd(String str, boolean z, boolean z2) {
        InterfaceC9782e0 interfaceC9782e0 = this.f19510a;
        if (interfaceC9782e0 == null) {
            return;
        }
        if (C10106u.m1239a()) {
            interfaceC9782e0.onAdEnd(str, z, z2);
            return;
        }
        this.f19511b.execute(new RunnableC9788c(str, z, z2));
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public final void onAdLeftApplication(String str) {
        InterfaceC9782e0 interfaceC9782e0 = this.f19510a;
        if (interfaceC9782e0 == null) {
            return;
        }
        if (C10106u.m1239a()) {
            interfaceC9782e0.onAdLeftApplication(str);
            return;
        }
        this.f19511b.execute(new RunnableC9791f(str));
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public final void onAdRewarded(String str) {
        InterfaceC9782e0 interfaceC9782e0 = this.f19510a;
        if (interfaceC9782e0 == null) {
            return;
        }
        if (C10106u.m1239a()) {
            interfaceC9782e0.onAdRewarded(str);
            return;
        }
        this.f19511b.execute(new RunnableC9792g(str));
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public final void onAdStart(String str) {
        InterfaceC9782e0 interfaceC9782e0 = this.f19510a;
        if (interfaceC9782e0 == null) {
            return;
        }
        if (C10106u.m1239a()) {
            interfaceC9782e0.onAdStart(str);
            return;
        }
        this.f19511b.execute(new RunnableC9787b(str));
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public final void onAdViewed(String str) {
        InterfaceC9782e0 interfaceC9782e0 = this.f19510a;
        if (interfaceC9782e0 == null) {
            return;
        }
        if (C10106u.m1239a()) {
            interfaceC9782e0.onAdViewed(str);
            return;
        }
        this.f19511b.execute(new RunnableC9794i(str));
    }

    @Override // com.vungle.warren.InterfaceC9782e0
    public final void onError(String str, VungleException vungleException) {
        InterfaceC9782e0 interfaceC9782e0 = this.f19510a;
        if (interfaceC9782e0 == null) {
            return;
        }
        if (C10106u.m1239a()) {
            interfaceC9782e0.onError(str, vungleException);
            return;
        }
        this.f19511b.execute(new RunnableC9793h(str, vungleException));
    }
}
