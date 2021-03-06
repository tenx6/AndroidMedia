package com.cxh.androidmedia.render_old.bean;

/**
 * Created by Cxh
 * Time : 2020-05-27  13:01
 * Desc :
 */
public class FilterBean {

    private int mFilterId;
    private String mFilterName;
    private String mBeautyType;

    public FilterBean(int filterId, String filterName) {
        mFilterId = filterId;
        mFilterName = filterName;
    }

    public FilterBean(String filterName, String beautyType) {
        mFilterName = filterName;
        mBeautyType = beautyType;
    }

    public int getFilterId() {
        return mFilterId;
    }

    public void setFilterId(int filterId) {
        mFilterId = filterId;
    }

    public String getFilterName() {
        return mFilterName;
    }

    public void setFilterName(String filterName) {
        mFilterName = filterName;
    }

    public String getBeautyType() {
        return mBeautyType;
    }

    public void setBeautyType(String beautyType) {
        mBeautyType = beautyType;
    }
}
