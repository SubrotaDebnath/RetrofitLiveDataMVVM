package subrota.shuvro.retrofitlivedatamvvm.View.Adapters;

import android.content.Context;

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

    public Class ViewHolder
}
