package com.kuo.hypermarket.dto;

import com.kuo.hypermarket.mbg.model.UmsAdmin;
import com.kuo.hypermarket.mbg.model.UmsResource;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wangfangfang
 * @Title: AdminUserDetails
 * @Description: SpringSecurity需要的用户详情
 * @date 2020/4/2710:35 下午
 * @since 1.8
 */
public class AdminUserDetails implements UserDetails {
    private UmsAdmin umsAdmin;
    private List<UmsResource> resourceList;

    public AdminUserDetails(UmsAdmin umsAdmin) {
        this.umsAdmin = umsAdmin;
    }
    public AdminUserDetails(UmsAdmin umsAdmin,List<UmsResource> resourceList) {
        this.umsAdmin = umsAdmin;
        this.resourceList = resourceList;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //返回当前用户的角色
        return resourceList.stream()
                .map(role ->new SimpleGrantedAuthority(role.getId()+":"+role.getName()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return umsAdmin.getPassword();
    }

    @Override
    public String getUsername() {
        return umsAdmin.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return umsAdmin.getStatus().equals(1);
    }
}