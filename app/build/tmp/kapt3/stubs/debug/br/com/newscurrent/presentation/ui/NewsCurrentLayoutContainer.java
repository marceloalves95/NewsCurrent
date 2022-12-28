package br.com.newscurrent.presentation.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lbr/com/newscurrent/presentation/ui/NewsCurrentLayoutContainer;", "", "binding", "Lbr/com/newscurrent/databinding/NewsCurrentMainBinding;", "(Lbr/com/newscurrent/databinding/NewsCurrentMainBinding;)V", "newsAdapter", "Lbr/com/newscurrent/presentation/adapter/NewsCurrentAdapter;", "handleErrorData", "", "error", "", "handleScreenData", "Landroidx/recyclerview/widget/RecyclerView;", "news", "Lbr/com/newscurrent/domain/models/News;", "setState", "state", "Lbr/com/newscurrent/presentation/model/NewsCurrentState;", "app_debug"})
public final class NewsCurrentLayoutContainer {
    private final br.com.newscurrent.databinding.NewsCurrentMainBinding binding = null;
    private br.com.newscurrent.presentation.adapter.NewsCurrentAdapter newsAdapter;
    
    public NewsCurrentLayoutContainer(@org.jetbrains.annotations.NotNull
    br.com.newscurrent.databinding.NewsCurrentMainBinding binding) {
        super();
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull
    br.com.newscurrent.presentation.model.NewsCurrentState state) {
    }
    
    private final androidx.recyclerview.widget.RecyclerView handleScreenData(br.com.newscurrent.domain.models.News news) {
        return null;
    }
    
    private final void handleErrorData(java.lang.Throwable error) {
    }
}