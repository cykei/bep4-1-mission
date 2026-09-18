package com.back.boundedContext.post.domain;

import com.back.global.jpa.entity.BaseIdAndTime;
import com.back.global.jpa.entity.BaseIdAndTimeManual;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "POST_MEMBER")
@NoArgsConstructor
@Getter
public class PostMember extends BaseIdAndTimeManual {
    // 이렇게 다 복제한다니? Member 테이블 하나더 만드는거나 다름없군. 동기화 문제가 발생하겠는걸.
    @Column(unique = true)
    private String username;
    private String password;
    private String nickname;
    private int activityScore;
}
