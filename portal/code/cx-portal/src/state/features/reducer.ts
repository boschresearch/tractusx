import { combineReducers } from 'redux'
import appsSlice from 'state/features/apps/apps'
import postsSlice from 'state/features/posts/posts'
import userSlice from 'state/features/user/userSlice'
import partnerNetworkSlice from 'state/features/partnerNetwork/partnerNetworkSlice'

const rootReducer = combineReducers({
  apps: appsSlice.reducer,
  posts: postsSlice.reducer,
  user: userSlice,
  partnerNetwork: partnerNetworkSlice.reducer
})

export default rootReducer
