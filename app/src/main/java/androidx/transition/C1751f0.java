package androidx.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.transition.Transition;
import com.ambrose.overwall.R;
import java.util.ArrayList;

/* renamed from: androidx.transition.f0 */
/* loaded from: classes.dex */
public final class C1751f0 extends C1757j {

    /* renamed from: a */
    public final /* synthetic */ ViewGroup f4253a;

    /* renamed from: b */
    public final /* synthetic */ View f4254b;

    /* renamed from: c */
    public final /* synthetic */ View f4255c;

    /* renamed from: d */
    public final /* synthetic */ Visibility f4256d;

    public C1751f0(Visibility visibility, ViewGroup viewGroup, View view, View view2) {
        this.f4256d = visibility;
        this.f4253a = viewGroup;
        this.f4254b = view;
        this.f4255c = view2;
    }

    @Override // androidx.transition.C1757j, androidx.transition.Transition.InterfaceC1723d
    /* renamed from: a */
    public final void mo9987a() {
        this.f4253a.getOverlay().remove(this.f4254b);
    }

    @Override // androidx.transition.Transition.InterfaceC1723d
    /* renamed from: c */
    public final void mo9962c(@NonNull Transition transition) {
        this.f4255c.setTag(R.id.save_overlay_view, null);
        this.f4253a.getOverlay().remove(this.f4254b);
        transition.mo9966w(this);
    }

    @Override // androidx.transition.C1757j, androidx.transition.Transition.InterfaceC1723d
    /* renamed from: e */
    public final void mo9985e() {
        View view = this.f4254b;
        if (view.getParent() == null) {
            this.f4253a.getOverlay().add(view);
            return;
        }
        Visibility visibility = this.f4256d;
        ArrayList<Animator> arrayList = visibility.f4194m;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            arrayList.get(size).cancel();
        }
        ArrayList<Transition.InterfaceC1723d> arrayList2 = visibility.f4198q;
        if (arrayList2 != null && arrayList2.size() > 0) {
            ArrayList arrayList3 = (ArrayList) visibility.f4198q.clone();
            int size2 = arrayList3.size();
            for (int i = 0; i < size2; i++) {
                ((Transition.InterfaceC1723d) arrayList3.get(i)).mo9986b();
            }
        }
    }
}
