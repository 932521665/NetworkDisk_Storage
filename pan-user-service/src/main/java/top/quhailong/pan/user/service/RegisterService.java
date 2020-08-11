package top.quhailong.pan.user.service;

import org.springframework.web.multipart.MultipartFile;
import top.quhailong.pan.request.ChangePwdRequest;
import top.quhailong.pan.request.RegPhoneSendRequest;
import top.quhailong.pan.request.UserRegistRequest;
import top.quhailong.pan.utils.RestAPIResult;

import java.io.IOException;

public interface RegisterService {
    /**
     * 用户名查重数据处理
     *
     * @author: quhailong
     * @date: 2019/9/25
     */
    RestAPIResult<String> checkUserNameHandle(String username);

    /**
     * 手机号查重数据处理
     *
     * @author: quhailong
     * @date: 2019/9/25
     */
    RestAPIResult<String> checkPhoneHandle(String phoneNum);

    /**
     * 用户注册数据处理
     *
     * @author: quhailong
     * @date: 2019/9/25
     */
    RestAPIResult<String> userRegistHandle(UserRegistRequest request) throws Exception;

    /**
     * 注册发送短信数据处理
     *
     * @author: quhailong
     * @date: 2019/9/26
     */
    RestAPIResult<String> regPhoneSendHandle(RegPhoneSendRequest request);

    /**
     * 修改密码数据处理
     *
     * @author: quhailong
     * @date: 2019/9/26
     */
    RestAPIResult<String> changePwdHandle(ChangePwdRequest request);

    /**
     * 加载用户头像数据处理
     *
     * @author: quhailong
     * @date: 2019/9/26
     */
    RestAPIResult<String> loadImgHandle(String uid);

    /**
     * 上传用户头像数据处理
     *
     * @author: quhailong
     * @date: 2019/9/26
     */
    RestAPIResult<String> uploadPicHandle(String uid, MultipartFile file) throws IOException;
}
