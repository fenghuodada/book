package com.google.android.material.bottomappbar;

import androidx.annotation.NonNull;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: com.google.android.material.bottomappbar.b */
/* loaded from: classes3.dex */
public final class C7594b extends FloatingActionButton.AbstractC7720a {

    /* renamed from: a */
    public final /* synthetic */ int f14430a;

    /* renamed from: b */
    public final /* synthetic */ BottomAppBar f14431b;

    /* renamed from: com.google.android.material.bottomappbar.b$a */
    /* loaded from: classes3.dex */
    public class C7595a extends FloatingActionButton.AbstractC7720a {
        public C7595a() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC7720a
        /* renamed from: b */
        public final void mo4553b() {
            BottomAppBar bottomAppBar = C7594b.this.f14431b;
            int i = BottomAppBar.f14405m0;
            bottomAppBar.getClass();
        }
    }

    public C7594b(BottomAppBar bottomAppBar, int i) {
        this.f14431b = bottomAppBar;
        this.f14430a = i;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC7720a
    /* renamed from: a */
    public final void mo4554a(@NonNull FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.f14431b.m4760y(this.f14430a));
        floatingActionButton.m4559k(new C7595a(), true);
    }
}
