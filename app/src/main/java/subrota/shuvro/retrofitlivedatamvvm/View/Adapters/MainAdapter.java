package subrota.shuvro.retrofitlivedatamvvm.View.Adapters;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import java.util.ArrayList;
import java.util.List;

import subrota.shuvro.retrofitlivedatamvvm.Model.UserDataClass.UserResponseDataSet;

public class MainAdapter {
    private Context context;
    private List <UserResponseDataSet> dataSets = new ArrayList<>();

    public MainAdapter(Context context, List<UserResponseDataSet> dataSets) {
        this.context = context;
        this.dataSets = dataSets;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
