package site.weic.rain.service.contant;

import site.weic.rain.common.constant.WebConstant;

/**
 * ServiceConstant
 *
 * @author Zhang Wei
 * @version ServiceConstant.java v1.0 2023-03-05
 */
public interface ServiceConstant {

    String HEADER_NAME = "MSG-ID";

    static String getHeaderName(){
        WebConstant.getMsgIdName();
        return HEADER_NAME;
    }
}
