package subrota.shuvro.retrofitlivedatamvvm.View.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

import subrota.shuvro.retrofitlivedatamvvm.Model.UserDataClass.UserResponseDataSet;
import subrota.shuvro.retrofitlivedatamvvm.R;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder>{
    private Context context;
    private List <UserResponseDataSet> dataSets = new ArrayList<>();

    public MainAdapter(Context context, List<UserResponseDataSet> dataSets) {
        this.context = context;
        this.dataSets = dataSets;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.user_card_row, parent,false);
        return new  MainAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return dataSets.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
