/* eslint-disable no-undef */
// eslint-disable-next-line no-use-before-define
import React, { useState } from 'react';
import AuthContext from './AuthContext';
import AuthService from './AuthService';

const username = AuthService.getUsername();

export default function AuthProvider({ children }: { children: React.ReactNode }) {
  const [user, setUser] = useState<any>(username);

  const signIn = (newUser: string, callback: VoidFunction = () => {}) => {
    setUser(newUser);
    AuthService.signIn(newUser);
    callback();
  };

  const signOut = (callback: VoidFunction = () => {}) => {
    AuthService.signOut();
    window.location.href = '/';
    callback();
  };

  const isAdmin = () => user === 'admin';

  // eslint-disable-next-line react/jsx-no-constructed-context-values
  const value = {
    user, signIn, signOut, isAdmin,
  };

  return <AuthContext.Provider value={value}>{children}</AuthContext.Provider>;
}