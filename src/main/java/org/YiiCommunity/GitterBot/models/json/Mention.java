package org.YiiCommunity.GitterBot.models.json;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Alex on 10/20/15.
 */
@Getter
@Setter
public class Mention {
    private String screenName;
    private String userId;
}
