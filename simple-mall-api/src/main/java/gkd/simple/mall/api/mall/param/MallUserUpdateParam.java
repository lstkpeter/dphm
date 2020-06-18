
package gkd.simple.mall.api.mall.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.io.Serializable;

/**
 * 用户修改param
 */
@Data
public class MallUserUpdateParam implements Serializable {

    @ApiModelProperty("用户名")
    private String loginName;

    @ApiModelProperty("用户昵称")
    private String nickName;

    @ApiModelProperty("用户密码(需要MD5加密)")
    private String passwordMd5;

    @ApiModelProperty("个性签名")
    private String introduceSign;

    @ApiModelProperty("是否注销")
    private Byte isDeleted;

    @ApiModelProperty("身份状态是否锁定")
    private Byte lockedFlag;


}
