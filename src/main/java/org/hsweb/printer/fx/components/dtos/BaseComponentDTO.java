/*
 *  Copyright (c) 2015.  meicanyun.com Corporation Limited.
 *  All rights reserved.
 *
 *  This software is the confidential and proprietary information of
 *  meicanyun Company. ("Confidential Information").  You shall not
 *  disclose such Confidential Information and shall use it only in
 *  accordance with the terms of the license agreement you entered into
 *  with meicanyun.com.
 */

package org.hsweb.printer.fx.components.dtos;

import java.io.Serializable;

/**
 * Created by xiong on 2017-07-08.
 */
public class BaseComponentDTO extends ExportComponentDTO implements Serializable {
    private Double windowWidth;
    private Double windowHeight;



    public Double getWindowWidth() {
        return windowWidth;
    }

    public void setWindowWidth(Double windowWidth) {
        this.windowWidth = windowWidth;
    }

    public Double getWindowHeight() {
        return windowHeight;
    }

    public void setWindowHeight(Double windowHeight) {
        this.windowHeight = windowHeight;
    }

}