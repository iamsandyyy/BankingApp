import './App.css';
import { Routes, Route } from 'react-router-dom';
import Navbar from './component/Navbar';
import Account from './APIcall/Account';
import CreateAccount from './APIcall/CreateAccount';
import FetchAccountById from './APIcall/FetchAccountById';
import DepositAmount from './APIcall/DepositAmount';
import WithdrawAmount from './APIcall/WithdrawAmount';
import EnableAccount from './APIcall/EnableAccount';
import DisableAccount from './APIcall/DisableAccount';
import TransferAmount from './APIcall/TransferAmount';
import Login from './APIcall/Login';
import TransactionList from './APIcall/TransactionList';
import CreditCardPayment from './APIcall/CreditCardPayment';
import LoanRequest from './APIcall/LoanRequest';

function App() {
  return (
    <div className="App">
      <Navbar />
      <Routes>
        <Route exact path="/account" element={<Account />} />
        <Route exact path="/createAccount" element={<CreateAccount />} />
        <Route exact path="/fetchAccountById" element={<FetchAccountById />} />
        <Route exact path="/depositAmount" element={<DepositAmount />} />
        <Route exact path="/withdrawAmount" element={<WithdrawAmount />} />
        <Route exact path="/enableAccount" element={<EnableAccount />} />
        <Route exact path="/disableAccount" element={<DisableAccount />} />
        <Route exact path="/transferAmount" element={<TransferAmount />} />
        <Route exact path="/login" element={<Login />} />
        <Route exact path="/transactions" element={<TransactionList />} />
        <Route exact path="/creditCardPayment" element={<CreditCardPayment />} />
        <Route exact path="/loanRequest" element={<LoanRequest />} />
      </Routes>
    </div>
  );
}

export default App;