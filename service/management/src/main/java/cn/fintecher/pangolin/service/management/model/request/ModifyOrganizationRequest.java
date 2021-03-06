package cn.fintecher.pangolin.service.management.model.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * Created by ChenChang on 2018/6/8.
 */
@Data
public class ModifyOrganizationRequest extends CreateOrganizationRequest {
    @ApiModelProperty("id")
    @NotNull(message = "{id.is.required}")
    private String id;
}
