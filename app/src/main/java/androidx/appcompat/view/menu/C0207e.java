package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.DialogInterfaceC0098c;
import androidx.appcompat.view.menu.InterfaceC0226m;
import androidx.appcompat.view.menu.InterfaceC0228n;
import com.ambrose.overwall.R;
import java.util.ArrayList;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.view.menu.e */
/* loaded from: classes.dex */
public final class C0207e implements InterfaceC0226m, AdapterView.OnItemClickListener {

    /* renamed from: a */
    public Context f670a;

    /* renamed from: b */
    public LayoutInflater f671b;

    /* renamed from: c */
    public C0210g f672c;

    /* renamed from: d */
    public ExpandedMenuView f673d;

    /* renamed from: e */
    public InterfaceC0226m.InterfaceC0227a f674e;

    /* renamed from: f */
    public C0208a f675f;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    /* loaded from: classes.dex */
    public class C0208a extends BaseAdapter {

        /* renamed from: a */
        public int f676a = -1;

        public C0208a() {
            m12854a();
        }

        /* renamed from: a */
        public final void m12854a() {
            C0210g c0210g = C0207e.this.f672c;
            C0214i c0214i = c0210g.f706v;
            if (c0214i != null) {
                c0210g.m12845i();
                ArrayList<C0214i> arrayList = c0210g.f694j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == c0214i) {
                        this.f676a = i;
                        return;
                    }
                }
            }
            this.f676a = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b */
        public final C0214i getItem(int i) {
            C0207e c0207e = C0207e.this;
            C0210g c0210g = c0207e.f672c;
            c0210g.m12845i();
            ArrayList<C0214i> arrayList = c0210g.f694j;
            c0207e.getClass();
            int i2 = i + 0;
            int i3 = this.f676a;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return arrayList.get(i2);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            C0207e c0207e = C0207e.this;
            C0210g c0210g = c0207e.f672c;
            c0210g.m12845i();
            int size = c0210g.f694j.size();
            c0207e.getClass();
            int i = size + 0;
            if (this.f676a < 0) {
                return i;
            }
            return i - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = C0207e.this.f671b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((InterfaceC0228n.InterfaceC0229a) view).mo4533j(getItem(i));
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            m12854a();
            super.notifyDataSetChanged();
        }
    }

    public C0207e(Context context) {
        this.f670a = context;
        this.f671b = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0226m
    /* renamed from: b */
    public final void mo12710b(C0210g c0210g, boolean z) {
        InterfaceC0226m.InterfaceC0227a interfaceC0227a = this.f674e;
        if (interfaceC0227a != null) {
            interfaceC0227a.mo12698b(c0210g, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0226m
    /* renamed from: c */
    public final boolean mo12709c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0226m
    /* renamed from: d */
    public final void mo12825d(InterfaceC0226m.InterfaceC0227a interfaceC0227a) {
        this.f674e = interfaceC0227a;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0226m
    /* renamed from: e */
    public final boolean mo12741e(C0214i c0214i) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0226m
    /* renamed from: f */
    public final void mo12708f(Context context, C0210g c0210g) {
        if (this.f670a != null) {
            this.f670a = context;
            if (this.f671b == null) {
                this.f671b = LayoutInflater.from(context);
            }
        }
        this.f672c = c0210g;
        C0208a c0208a = this.f675f;
        if (c0208a != null) {
            c0208a.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0226m
    /* renamed from: g */
    public final void mo12707g() {
        C0208a c0208a = this.f675f;
        if (c0208a != null) {
            c0208a.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0226m
    /* renamed from: i */
    public final boolean mo12705i(SubMenuC0236s subMenuC0236s) {
        if (!subMenuC0236s.hasVisibleItems()) {
            return false;
        }
        DialogInterface$OnKeyListenerC0213h dialogInterface$OnKeyListenerC0213h = new DialogInterface$OnKeyListenerC0213h(subMenuC0236s);
        Context context = subMenuC0236s.f685a;
        DialogInterfaceC0098c.C0099a c0099a = new DialogInterfaceC0098c.C0099a(context);
        C0207e c0207e = new C0207e(c0099a.getContext());
        dialogInterface$OnKeyListenerC0213h.f711c = c0207e;
        c0207e.f674e = dialogInterface$OnKeyListenerC0213h;
        subMenuC0236s.m12849b(c0207e, context);
        C0207e c0207e2 = dialogInterface$OnKeyListenerC0213h.f711c;
        if (c0207e2.f675f == null) {
            c0207e2.f675f = new C0208a();
        }
        C0208a c0208a = c0207e2.f675f;
        AlertController.C0083b c0083b = c0099a.f239a;
        c0083b.f199k = c0208a;
        c0083b.f200l = dialogInterface$OnKeyListenerC0213h;
        View view = subMenuC0236s.f699o;
        if (view != null) {
            c0083b.f193e = view;
        } else {
            c0083b.f191c = subMenuC0236s.f698n;
            c0099a.setTitle(subMenuC0236s.f697m);
        }
        c0083b.f198j = dialogInterface$OnKeyListenerC0213h;
        DialogInterfaceC0098c create = c0099a.create();
        dialogInterface$OnKeyListenerC0213h.f710b = create;
        create.setOnDismissListener(dialogInterface$OnKeyListenerC0213h);
        WindowManager.LayoutParams attributes = dialogInterface$OnKeyListenerC0213h.f710b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterface$OnKeyListenerC0213h.f710b.show();
        InterfaceC0226m.InterfaceC0227a interfaceC0227a = this.f674e;
        if (interfaceC0227a != null) {
            interfaceC0227a.mo12697c(subMenuC0236s);
            return true;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0226m
    /* renamed from: j */
    public final boolean mo12740j(C0214i c0214i) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f672c.m12842q(this.f675f.getItem(i), this, 0);
    }
}
