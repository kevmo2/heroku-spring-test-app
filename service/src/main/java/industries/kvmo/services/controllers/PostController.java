package industries.kvmo.services.controllers;

import industries.kvmo.services.dto.PostRequest;
import industries.kvmo.services.dto.PostResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 */
@RestController
@RequestMapping("v1/request")
public class PostController {
    
    @RequestMapping(method = RequestMethod.POST)
    public PostResponse post(@RequestBody PostRequest request) {
        return new PostResponse(request.getId(),
                StringUtils.reverse(request.getContent()));
    }
}
