package com.android.tool.util.manager;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.C0063d;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ambrose.overwall.R;
import com.android.tool.util.manager.C2560c;
import com.android.tool.util.manager.View$OnClickListenerC2583e;
import com.qmuiteam.qmui.layout.C9057a;
import com.qmuiteam.qmui.qqface.C9094c;
import com.qmuiteam.qmui.skin.C9106f;
import com.qmuiteam.qmui.skin.C9135i;
import com.qmuiteam.qmui.util.C9141b;
import com.qmuiteam.qmui.util.C9145f;
import com.qmuiteam.qmui.widget.popup.C9227c;
import com.tencent.mmkv.MMKV;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.android.tool.util.manager.f */
/* loaded from: classes.dex */
public final class C2585f extends C9227c {

    /* renamed from: p */
    public final C2560c.InterfaceC2564d f6087p;

    /* renamed from: q */
    public final List<String> f6088q;

    /* renamed from: com.android.tool.util.manager.f$a */
    /* loaded from: classes.dex */
    public class C2586a extends RecyclerView.AbstractC1572e<C2587b> {
        public C2586a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
        public final int getItemCount() {
            return C2585f.this.f6088q.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
        public final void onBindViewHolder(@NonNull C2587b c2587b, int i) {
            C2587b c2587b2 = c2587b;
            String str = C2585f.this.f6088q.get(i);
            c2587b2.f6091c = str;
            c2587b2.f6090b.setText(str);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1572e
        @NonNull
        public final C2587b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
            C9094c c9094c = new C9094c(viewGroup.getContext());
            c9094c.setTextSize(C9141b.m2645b(viewGroup.getContext(), 15));
            c9094c.setTextColor(-16777216);
            int m2646a = C9141b.m2646a(viewGroup.getContext(), 20);
            int m2646a2 = C9141b.m2646a(viewGroup.getContext(), 12);
            c9094c.setBackground(C9145f.m2634g(viewGroup.getContext(), R.attr.qmui_skin_support_s_list_item_bg_1));
            c9094c.setPadding(m2646a, m2646a2, m2646a, m2646a2);
            return new C2587b(c9094c);
        }
    }

    /* renamed from: com.android.tool.util.manager.f$b */
    /* loaded from: classes.dex */
    public class C2587b extends RecyclerView.AbstractC1597y {

        /* renamed from: b */
        public final C9094c f6090b;

        /* renamed from: c */
        public String f6091c;

        /* renamed from: com.android.tool.util.manager.f$b$a */
        /* loaded from: classes.dex */
        public class View$OnClickListenerC2588a implements View.OnClickListener {
            public View$OnClickListenerC2588a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2587b c2587b = C2587b.this;
                String str = c2587b.f6091c;
                if (str != null) {
                    C2585f c2585f = C2585f.this;
                    View$OnClickListenerC2583e view$OnClickListenerC2583e = View$OnClickListenerC2583e.this;
                    C2560c.InterfaceC2563c interfaceC2563c = view$OnClickListenerC2583e.f6084b;
                    C2560c.C2565e c2565e = view$OnClickListenerC2583e.f6083a;
                    interfaceC2563c.mo9356a(c2565e.f6076c, str);
                    View view2 = c2565e.f6075b;
                    int i = C9106f.f17535a;
                    C9135i c9135i = c2565e.f6076c;
                    C9106f.m2677c(view2, c9135i.m2655c());
                    if (c2565e.f6077d != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(c2565e.f6077d.f6068a);
                        sb.append(";");
                        sb.append(c9135i.m2655c());
                        sb.append(c2565e.m9357b());
                        MMKV.m2534d().m2536b(c2565e.m9358a(), sb.toString());
                        C2560c.C2562b c2562b = c2565e.f6077d;
                        while (true) {
                            C2560c.C2562b c2562b2 = c2562b.f6073f;
                            if (c2562b2 == null) {
                                break;
                            }
                            String m9359a = c2562b2.m9359a();
                            sb.setLength(0);
                            sb.append(c2562b2.f6068a);
                            sb.append(";");
                            sb.append(m9359a + "_" + c2562b.f6069b);
                            MMKV m2534d = MMKV.m2534d();
                            StringBuilder m13052b = C0063d.m13052b("m:", m9359a, "@");
                            m13052b.append(c2562b.f6069b);
                            m2534d.m2536b(m13052b.toString(), sb.toString());
                            c2562b = c2562b2;
                        }
                    }
                    c2585f.f17892a.dismiss();
                }
            }
        }

        public C2587b(@NonNull C9094c c9094c) {
            super(c9094c);
            this.f6090b = c9094c;
            c9094c.setOnClickListener(new View$OnClickListenerC2588a());
        }
    }

    public C2585f(Context context, ArrayList arrayList, View$OnClickListenerC2583e.C2584a c2584a) {
        super(context);
        this.f6087p = c2584a;
        this.f6088q = arrayList;
        this.f17907k = true;
        int m2646a = C9141b.m2646a(context, 54);
        C9057a c9057a = new C9057a(context);
        c9057a.setText(R.string.app_new_attr);
        c9057a.setId(View.generateViewId());
        c9057a.setRadius(m2646a / 2);
        c9057a.setBackgroundColor(-1);
        c9057a.setChangeAlphaWhenPress(true);
        int m2646a2 = C9141b.m2646a(context, 24);
        ConstraintLayout.C0562a c0562a = new ConstraintLayout.C0562a(0, m2646a);
        ((ViewGroup.MarginLayoutParams) c0562a).leftMargin = m2646a2;
        ((ViewGroup.MarginLayoutParams) c0562a).rightMargin = m2646a2;
        ((ViewGroup.MarginLayoutParams) c0562a).topMargin = C9141b.m2646a(context, 60);
        c0562a.f1960e = 0;
        c0562a.f1966h = 0;
        c0562a.f1968i = 0;
        this.f17911o.add(new C9227c.C9230c(c9057a, c0562a));
        RecyclerView recyclerView = new RecyclerView(context, null);
        recyclerView.setId(View.generateViewId());
        recyclerView.setBackgroundColor(-1);
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setAdapter(new C2586a());
        ConstraintLayout.C0562a c0562a2 = new ConstraintLayout.C0562a(0, 0);
        ((ViewGroup.MarginLayoutParams) c0562a2).leftMargin = m2646a2;
        ((ViewGroup.MarginLayoutParams) c0562a2).rightMargin = m2646a2;
        ((ViewGroup.MarginLayoutParams) c0562a2).topMargin = C9141b.m2646a(context, 20);
        c0562a2.f1960e = 0;
        c0562a2.f1966h = 0;
        c0562a2.f1970j = c9057a.getId();
        ((ViewGroup.MarginLayoutParams) c0562a2).bottomMargin = C9141b.m2646a(context, 20);
        c0562a2.f1972k = R.id.qmui_popup_close_btn_id;
        this.f17911o.add(new C9227c.C9230c(recyclerView, c0562a2));
    }
}
