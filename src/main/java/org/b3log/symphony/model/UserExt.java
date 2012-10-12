/*
 * Copyright (c) 2012, B3log Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.b3log.symphony.model;

/**
 * This class defines ext of user model relevant keys.
 *
 * @author <a href="mailto:DL88250@gmail.com">Liang Ding</a>
 * @version 1.0.0.4, Oct 12, 2012
 * @since 0.2.0
 * @see org.b3log.latke.model.User
 */
public final class UserExt {

    /**
     * Key of user article count.
     */
    public static final String USER_ARTICLE_COUNT = "userArticleCount";
    /**
     * Key of user comment count.
     */
    public static final String USER_COMMENT_COUNT = "userCommentCount";
    /**
     * Key of new tag count.
     */
    public static final String USER_TAG_COUNT = "userTagCount";
    /**
     * Key of user status.
     */
    public static final String USER_STATUS = "userStatus";
    /**
     * Key of user QQ.
     */
    public static final String USER_QQ = "userQQ";
    /**
     * Key of user number.
     */
    public static final String USER_NO = "userNo";
    /**
     * Key of user intro.
     */
    public static final String USER_INTRO = "userIntro";
    /**
     * Key of user B3log key.
     */
    public static final String USER_B3_KEY = "userB3Key";
    /**
     * Key of user B3log client add article URL.
     */
    public static final String USER_B3_CLIENT_ADD_ARTICLE_URL = "userB3ClientAddArticleURL";
    /**
     * Key of user B3log client add comment URL.
     */
    public static final String USER_B3_CLIENT_ADD_COMMENT_URL = "userB3ClientAddCommentURL";
    //// Transient ////
    /**
     * Key of user thumbnail URL.
     */
    public static final String USER_T_THUMBNAIL_URL = "userThumbnailURL";
    /**
     * Key of user create time.
     */
    public static final String USER_T_CREATE_TIME = "userCreateTime";

    /**
     * Private constructor.
     */
    private UserExt() {
    }
}
