package it.sogei.svildep.istanzaservice.model;

public enum Role {

    ADMIN_ROLE, OPERATORE_RTS_ROLE;

    public static String toString(Role[] roles) {
        StringBuilder sb = new StringBuilder();
        for (Role role : roles) sb.append(role.name()).append(",");
        return sb.toString();
    }
}
