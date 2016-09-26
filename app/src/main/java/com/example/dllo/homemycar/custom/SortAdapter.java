package com.example.dllo.homemycar.custom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SectionIndexer;
import android.widget.TextView;

import com.example.dllo.homemycar.R;

import java.util.List;

public class SortAdapter extends BaseAdapter implements SectionIndexer {

	private List<Entity> list = null;

	private Context mContext;

	public SortAdapter(Context mContext, List<Entity> list){
		this.mContext = mContext;
		this.list = list;
	}
	public void updateListView(List<Entity> list){
		this.list = list;
		notifyDataSetChanged();
	}



	@Override
	public int getCount() {
		return this.list.size();
	}

	@Override
	public Object getItem(int position) {
		return list.get(position);
	}
//复写的方法
	@Override
	public long getItemId(int position) {
		return position;
	}



	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		ViewHolder viewHolder = null;
		final Entity mContent = list.get(position);
		if (convertView== null) {
			convertView = LayoutInflater.from(mContext).inflate(R.layout.item_sort, null);
			viewHolder= new ViewHolder(convertView);
			convertView.setTag(viewHolder);
		}else {
			viewHolder = (ViewHolder) convertView.getTag();
		}
		//根据position获取分类的首字母的Char ascii值
		int section = getSectionForPosition(position);
		//如果当前位置等于该分类首字母的Char的位置 ，则认为是第一次出现
		if (position == getPositionForSection(section)) {
			viewHolder.tvLetter.setVisibility(View.VISIBLE);
			viewHolder.tvLetter.setText(mContent.getSortLetters());
		}else {
			viewHolder.tvLetter.setVisibility(View.GONE);
		}
		viewHolder.tvTitle.setText(this.list.get(position).getResult().getBrandlist().get(position).getList().get(position).getName());
		return convertView;
	}

	@Override
	public Object[] getSections() {
		return null;
	}
	/**
	 * 根据分类的首字母的Char ascii值获取其第一次出现该首字母的位置
	 */
	@Override
	public int getPositionForSection(int sectionIndex) {
		for (int i = 0; i < getCount(); i++) {
			String sortStr = list.get(i).getSortLetters();
			char firstChar = sortStr.toUpperCase().charAt(0);
			if (firstChar == sectionIndex) {
				return i;
			}
		}

		return -1;
	}

	/**
	 * 根据ListView的当前位置获取分类的首字母的Char ascii值
	 */
	@Override
	public int getSectionForPosition(int position) {
		return list.get(position).getSortLetters().charAt(0);
	}


	final static class ViewHolder{
		TextView tvLetter;
		TextView tvTitle;
		public ViewHolder(View itemView){
			tvTitle=(TextView) itemView.findViewById(R.id.title);
			tvLetter = (TextView) itemView.findViewById(R.id.catalog);
		}
	}
	/**
	 * 提取英文的首字母，非英文字母用#代替。
	 *
	 * @param str
	 * @return
	 */
	private String getAlpha(String str) {
		String sortStr = str.trim().substring(0, 1).toUpperCase();
		// 正则表达式，判断首字母是否是英文字母
		if (sortStr.matches("[A-Z]")) {
			return sortStr;
		} else {
			return "#";
		}
	}


}