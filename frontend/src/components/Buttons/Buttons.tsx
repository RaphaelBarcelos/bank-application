import { useNavigate } from 'react-router-dom'
import './Buttons.css'

export function LogInButton() {
    const navigate = useNavigate()

    return (
        <button className="login-button" onClick = {() => navigate('/login')}>
            Acessar Conta
        </button>
    )
}

export function SignUpButton() {
    const navigate = useNavigate()
    
    return (
        <button className="signup-button" onClick = {() => navigate('/signup')}>
            Abrir Conta
        </button>
    )
}

