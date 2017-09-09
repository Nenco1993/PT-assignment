package com.example.neven.test1.home_activity.adapter;

/**
 * Created by Neven on 4.9.2017..
 */

public class CrimesAdapter /*extends RecyclerView.Adapter<CrimesAdapter.CrimesViewHolder>*/ {

  /*  public static final int TYPE_HEADER = R.layout.header_crime;
    public static final int TYPE_ITEM = R.layout.child_crime;

    private List<RecyclerItem> listItems = new ArrayList<>();

    @Override
    public int getItemViewType(int position) {
        return listItems.get(position).getType();
    }

    @Override
    public CrimesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(viewType, parent, false);
        return new CrimesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CrimesViewHolder holder, int position) {
        holder.setText((String) listItems.get(position).getData());
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }

    public void setData(List<RecyclerItem> data) {
        if (data != null && !data.isEmpty()) {
            listItems.clear();
            listItems.addAll(data);
            notifyDataSetChanged();
        }
    }

    class CrimesViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tv_alphabet_letter)
        TextView tvAlphabetLetter;

        public CrimesViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        public void setText(String text) {
            tvAlphabetLetter.setText(text);
        }
    }*/
}
