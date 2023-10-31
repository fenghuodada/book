package com.qmuiteam.qmui.widget.tab;

import androidx.annotation.Nullable;
import androidx.viewpager.widget.AbstractC1821a;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;

/* renamed from: com.qmuiteam.qmui.widget.tab.b */
/* loaded from: classes3.dex */
public final class C9249b extends QMUIBasicTabSegment {

    /* renamed from: e */
    public ViewPager f17956e;

    /* renamed from: f */
    public AbstractC1821a f17957f;

    /* renamed from: g */
    public C9250a f17958g;

    /* renamed from: h */
    public C9251b f17959h;

    /* renamed from: com.qmuiteam.qmui.widget.tab.b$a */
    /* loaded from: classes3.dex */
    public static class C9250a implements ViewPager.InterfaceC1815i {

        /* renamed from: a */
        public final WeakReference<C9249b> f17960a;

        public C9250a(C9249b c9249b) {
            this.f17960a = new WeakReference<>(c9249b);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1815i
        public final void onPageScrollStateChanged(int i) {
            C9249b c9249b = this.f17960a.get();
            if (c9249b != null) {
                c9249b.setViewPagerScrollState(i);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1815i
        public final void onPageScrolled(int i, float f, int i2) {
            C9249b c9249b = this.f17960a.get();
            if (c9249b != null) {
                c9249b.getClass();
                if (!c9249b.f17955c && f != 0.0f) {
                    throw null;
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1815i
        public final void onPageSelected(int i) {
            C9249b c9249b = this.f17960a.get();
            if (c9249b != null && c9249b.f17953a != -1) {
                c9249b.f17953a = i;
            } else if (c9249b != null && c9249b.getSelectedIndex() != i && i < c9249b.getTabCount() && !c9249b.f17955c) {
                c9249b.f17955c = true;
                throw null;
            }
        }
    }

    /* renamed from: com.qmuiteam.qmui.widget.tab.b$b */
    /* loaded from: classes3.dex */
    public static class C9251b {
        public C9251b(ViewPager viewPager) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViewPagerScrollState(int i) {
        if (i == 0 && this.f17953a != -1) {
            if (this.f17955c) {
                this.f17953a = -1;
            } else {
                this.f17955c = true;
                throw null;
            }
        }
    }

    /* renamed from: j */
    public final void m2551j(boolean z) {
        AbstractC1821a abstractC1821a = this.f17957f;
        if (abstractC1821a == null) {
            if (!z) {
                return;
            }
            throw null;
        }
        int count = abstractC1821a.getCount();
        if (!z) {
            ViewPager viewPager = this.f17956e;
            if (viewPager != null && count > 0) {
                viewPager.getCurrentItem();
                if (!this.f17955c) {
                    this.f17955c = true;
                    throw null;
                }
                return;
            }
            return;
        }
        throw null;
    }

    public void setupWithViewPager(@Nullable ViewPager viewPager) {
        C9250a c9250a;
        ViewPager viewPager2 = this.f17956e;
        if (viewPager2 != null && (c9250a = this.f17958g) != null) {
            viewPager2.removeOnPageChangeListener(c9250a);
        }
        if (this.f17959h == null) {
            if (viewPager != null) {
                this.f17956e = viewPager;
                if (this.f17958g == null) {
                    this.f17958g = new C9250a(this);
                }
                viewPager.addOnPageChangeListener(this.f17958g);
                this.f17959h = new C9251b(viewPager);
                throw null;
            }
            this.f17956e = null;
            AbstractC1821a abstractC1821a = this.f17957f;
            this.f17957f = null;
            m2551j(false);
            return;
        }
        throw null;
    }
}
