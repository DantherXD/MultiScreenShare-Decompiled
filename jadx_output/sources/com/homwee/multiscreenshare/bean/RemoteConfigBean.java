package com.homwee.multiscreenshare.bean;

import com.homwee.multiscreenshare.MyApplication;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RemoteConfigBean {
    private ConfigBean ad_config;
    private ConfigBean airplay;
    private ConfigBean dlna_config;
    private ConfigBean screen_share;

    public static class ConfigBean {
        private List<String> brand;
        private List<String> country;

        public List<String> getBrand() {
            return this.brand;
        }

        public List<String> getCountry() {
            return this.country;
        }

        public void setBrand(List<String> list) {
            this.brand = list;
        }

        public void setCountry(List<String> list) {
            this.country = list;
        }
    }

    public boolean getAdTag() {
        ConfigBean configBean = this.ad_config;
        return configBean != null && configBean.getBrand() != null && getAd_config().getBrand().contains(MyApplication.b()) && getAd_config().getCountry().contains(MyApplication.d());
    }

    public ConfigBean getAd_config() {
        return this.ad_config;
    }

    public ConfigBean getAirplay() {
        return this.airplay;
    }

    public boolean getAirplayTag() {
        ConfigBean configBean = this.airplay;
        if (configBean == null || configBean.getBrand() == null) {
            return true;
        }
        return (getAirplay().getBrand().contains(MyApplication.b()) || getAirplay().getCountry().contains(MyApplication.d())) ? false : true;
    }

    public boolean getDlnaTag() {
        ConfigBean configBean = this.dlna_config;
        if (configBean == null || configBean.getBrand() == null) {
            return true;
        }
        return (getDlna_config().getBrand().contains(MyApplication.b()) || getDlna_config().getCountry().contains(MyApplication.d())) ? false : true;
    }

    public ConfigBean getDlna_config() {
        return this.dlna_config;
    }

    public boolean getScreenShareTag() {
        ConfigBean configBean = this.screen_share;
        if (configBean == null || configBean.getBrand() == null) {
            return true;
        }
        return (getScreen_share().getBrand().contains(MyApplication.b()) || getScreen_share().getCountry().contains(MyApplication.d())) ? false : true;
    }

    public ConfigBean getScreen_share() {
        return this.screen_share;
    }

    public void setAd_config(ConfigBean configBean) {
        this.ad_config = configBean;
    }

    public void setAirplay(ConfigBean configBean) {
        this.airplay = configBean;
    }

    public void setDlna_config(ConfigBean configBean) {
        this.dlna_config = configBean;
    }

    public void setScreen_share(ConfigBean configBean) {
        this.screen_share = configBean;
    }

    public String toString() {
        return "getDlnaTag=" + getDlnaTag() + " getScreenShareTag=" + getScreenShareTag() + " getAirplayTag=" + getAirplayTag() + " getAdTag=" + getAdTag();
    }
}
