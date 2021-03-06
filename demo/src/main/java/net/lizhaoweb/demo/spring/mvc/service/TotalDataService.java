/**
 * Copyright (c) 2016, Stupid Bird and/or its affiliates. All rights reserved.
 * STUPID BIRD PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 * @Project : parent
 * @Package : net.lizhaoweb.demo.spring.mvc.service
 * @author <a href="http://www.lizhaoweb.net">李召(John.Lee)</a>
 * @EMAIL 404644381@qq.com
 * @Time : 23:29
 */
package net.lizhaoweb.demo.spring.mvc.service;

import net.lizhaoweb.demo.spring.mvc.bean.TotalData;
import net.lizhaoweb.demo.spring.mvc.search.SearchTotalData;

/**
 * @author <a href="http://www.lizhaoweb.cn">李召(John.Lee)</a>
 * @version 1.0.0.0.1
 * @notes Created on 2016年09月20日<br>
 * Revision of last commit:$Revision$<br>
 * Author of last commit:$Author$<br>
 * Date of last commit:$Date$<br>
 */
public interface TotalDataService {

    /**
     * 查询数据。
     *
     * @param search 查询对象。
     * @return 返回数据列表。
     */
    TotalData get(SearchTotalData search);
}
